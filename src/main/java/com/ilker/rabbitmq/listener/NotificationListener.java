package com.ilker.rabbitmq.listener;

import com.ilker.rabbitmq.model.Notification;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationListener {

   @RabbitListener(queues = "ilker-35-queue")
    public void handleOnMessage(Notification notification){
      System.out.println("Message received..");
      System.out.println(notification.toString());
    }
}
