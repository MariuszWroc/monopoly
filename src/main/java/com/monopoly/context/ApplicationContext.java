package com.monopoly.context;

import org.apache.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationContext {
	private static Logger logger = Logger.getLogger(ApplicationContext.class.getClass());
	
	public static void main(String[] args) {
        SpringApplication.run(ApplicationContext.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
        	logger.info("Spring Boot works");
        };
    }
}
