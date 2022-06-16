package com.example.backendproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class BackendprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendprojectApplication.class, args);
    }

}
