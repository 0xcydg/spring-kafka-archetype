package com.kafka.demo.models;

public class Message {
   private String title;
   private String content;

   public Message() {}
   
   public Message(String title, String content) {
      this.title = title;
      this.content = content;
   }

   public String getTitle() {
      return this.title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getContent() {
      return this.content;
   }

   public void setContent(String content) {
      this.content = content;
   }

}
