package com.example.employeemanagementusingspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com")
public class EmployeeManagementUsingSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementUsingSpringBootApplication.class, args);
    }

}
