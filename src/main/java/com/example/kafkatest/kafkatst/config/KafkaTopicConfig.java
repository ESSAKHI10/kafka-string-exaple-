package com.example.kafkatest.kafkatst.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
// creating topics
public class KafkaTopicConfig {
    @Bean
    public NewTopic topic() {
        return TopicBuilder.name("noway").build();
    }

}
