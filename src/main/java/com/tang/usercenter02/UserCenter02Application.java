package com.tang.usercenter02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tang.usercenter02.mapper")
@SpringBootApplication
public class UserCenter02Application {

    public static void main(String[] args) {
        SpringApplication.run(UserCenter02Application.class, args);
    }

}
