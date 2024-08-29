package com.ilker.rabbitmq;

import com.ilker.rabbitmq.model.Notification;
import com.ilker.rabbitmq.producer.NotificationProducer;
import java.util.Date;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitApplication {


	public static void main(String[] args) {
		SpringApplication.run(RabbitApplication.class, args);

	}

}
