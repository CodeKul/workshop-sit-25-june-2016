package com.codekul.sit;

import com.codekul.sit.di.Car;
import com.codekul.sit.di.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SitDemoApplication {

    public static void main(String[] args) {
        SpringApplication
                .run(SitDemoApplication.class, args);
        
    }
}
