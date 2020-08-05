package com.example.filedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FileDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileDemoApplication.class, args);
    }
}