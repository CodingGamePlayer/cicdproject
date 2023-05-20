package com.example.cicdproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class CicdprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdprojectApplication.class, args);
    }

}
