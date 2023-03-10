package com.example.formsubmit;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.formsubmit.Mapper")
public class FormSubmitApplication {
    public static final Logger logger = LoggerFactory.getLogger(FormSubmitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FormSubmitApplication.class, args);
    }

}
