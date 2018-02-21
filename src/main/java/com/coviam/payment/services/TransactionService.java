package com.coviam.payment.services;

import com.coviam.payment.entity.Transaction;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TransactionService {

    List<Transaction> getTransactionsDetail(String userId);

    public Transaction processPayment(ResponseEntity<Boolean> paymentResponseEntity, Transaction transaction);

    public Transaction save(Transaction providerConfig);

    public Transaction findOne(String transactionId);

}
