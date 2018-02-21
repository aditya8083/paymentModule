package com.coviam.payment.kafka.producer;

import com.coviam.payment.dto.PaymentStatusDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {
    private static final Logger log = LoggerFactory.getLogger(KafkaProducer.class);

    @Autowired
    private KafkaTemplate<String, PaymentStatusDTO> kafkaTemplate;

    @Value("${update.booking.topic}")
    String kafkaTopic = "";

    public void send(PaymentStatusDTO paymentStatusDTO) {
        log.info("sending data='{}'", paymentStatusDTO);
        kafkaTemplate.send(kafkaTopic, paymentStatusDTO);
    }
}
