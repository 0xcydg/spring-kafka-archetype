package com.kafka.demo.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.kafka.demo.models.Message;

@Service
public class Producer {
   private static final Logger logger = LoggerFactory.getLogger(Producer.class);
   private static final String TOPIC = "demo";

   @Autowired
   @Qualifier("messageKafkaTemplate")
   private KafkaTemplate<String, Message> kafkaTemplate;

   public void publishMessage(Message message) {
      logger.info(String.format("#### -> Producing message -> %s %s", message.getTitle(), message.getContent()));
      this.kafkaTemplate.send(TOPIC, message);
   }
}
