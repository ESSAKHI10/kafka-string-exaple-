package com.example.kafkatest.kafkatst;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "noway", groupId = "groupId")
    void Listener(String data) {
        System.out.println("Listener receveid : " + data);
    }
}
