package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//开启事务
@MapperScan("com.example.mapper")//扫描mapper接口
public class SsmdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsmdemoApplication.class, args);
    }

}
