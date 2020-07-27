package com.boot.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;

@SpringBootApplication
public class BootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootKafkaApplication.class, args);
	}

}
