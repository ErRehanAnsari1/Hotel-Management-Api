package com.rest.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rest.hotel.repository")
@EntityScan(basePackages = "com.rest.hotel.entity")
public class HotelManagementApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelManagementApiApplication.class, args);
    }
}
