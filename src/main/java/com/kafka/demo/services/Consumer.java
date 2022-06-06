package com.kafka.demo.services;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.kafka.demo.models.Message;

@Service
public class Consumer {
   private final Logger logger = LoggerFactory.getLogger(Producer.class);

   @KafkaListener(topics = "demo", groupId = "group_id", containerFactory = "kafkaListenerContainerFactory")
   public void consume(Message message) throws IOException {
      logger.info(String.format("#### -> Consumed message -> %s %s", message.getTitle(), message.getContent()));
   }
}
