package ru.sber.photodata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PhotoDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoDataApplication.class, args);
    }
}
