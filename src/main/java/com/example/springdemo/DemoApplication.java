package com.example.springdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
    public CommandLineRunner sendMessage(KafkaTemplate<String, String> kafkaTemplate) {
        return args -> {
            kafkaTemplate.send("test", "¡Hola desde el dev container!");
        };
    }

    @KafkaListener(topics = "test", groupId = "test-group")
    public void listen(String message) {
		log.info("Mensaje recibido: {}", message);	
    }
}
