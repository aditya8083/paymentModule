package com.coviam.payment.services.impl;


import com.coviam.payment.dto.PaymentStatusDTO;
import com.coviam.payment.entity.Transaction;
import com.coviam.payment.entity.enums.PaymentStatus;
import com.coviam.payment.kafka.producer.KafkaProducer;
import com.coviam.payment.repository.TransactionRepository;
import com.coviam.payment.services.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
@Transactional(propagation = Propagation.REQUIRED)
public class TransactionServiceImpl implements TransactionService {

    @Value("${endpoint.updateBookingPayment}")
    private String updateBookingPayment;

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    KafkaProducer producer;

    private static final Logger LOGGER = LoggerFactory.getLogger(TransactionServiceImpl.class);

    @Override
    public Transaction save(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    @Override
    @Transactional(readOnly = true)
    public Transaction findOne(String transactionId) {
        return transactionRepository.findOne(transactionId);
    }

    @Override
    public List<Transaction> getTransactionsDetail(String userId) {
        List<Transaction> transactionList = transactionRepository.findByUserId(userId);
        return transactionList;
    }

    @Override
    public Transaction processPayment(ResponseEntity<Boolean> paymentResponseEntity, Transaction transaction) {

        PaymentStatus paymentStatus;
        final String uriString = updateBookingPayment;
        if (paymentResponseEntity.getStatusCode() != HttpStatus.OK) {
            paymentStatus = PaymentStatus.DEFERRED;
        }else{
            paymentStatus = PaymentStatus.SUCCESSFUL;
        }

        transaction.setPaymentStatus(paymentStatus);
        Transaction updatedTransaction = save(transaction);
        PaymentStatusDTO paymentStatusDTO = PaymentStatusDTO.newBuilder()
                .setSuperPnr(updatedTransaction.getSuperPnr())
                .setPaymentId(updatedTransaction.getId())
                .setStatus(updatedTransaction.getPaymentStatus().toString()).build();

        //send message to kafka
        producer.send(paymentStatusDTO);

        return updatedTransaction;

    }

}

