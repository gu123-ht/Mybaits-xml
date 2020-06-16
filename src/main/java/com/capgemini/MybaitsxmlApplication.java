package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.capgemini.dao")
public class MybaitsxmlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsxmlApplication.class, args);
    }

}
