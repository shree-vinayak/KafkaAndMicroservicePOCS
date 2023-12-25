package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics="",groupId = "")
    public void updateLocation(String value)
    {

    }
}
