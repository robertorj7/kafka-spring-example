package com.example.spring_kafka_example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "example_topic", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}
