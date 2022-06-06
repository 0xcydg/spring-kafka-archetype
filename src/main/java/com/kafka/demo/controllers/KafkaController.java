package com.kafka.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.models.Message;
import com.kafka.demo.services.Producer;

@RestController
public class KafkaController {
   private final Producer producer;
   
   @Autowired
   KafkaController(Producer producer) {
      this.producer = producer;
   }

   @PostMapping(value= "/publish")
   public String publishMessageToTopic(@RequestParam String title, @RequestParam String content, Model model) {
      this.producer.publishMessage(new Message(title, content));
      return "Message published successfully!";
   }

}
