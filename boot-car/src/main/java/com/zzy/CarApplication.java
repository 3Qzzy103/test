package com.zzy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.zzy.**.mapper")
@EnableTransactionManagement
public class CarApplication {
    public static void main(String[] args) {

        SpringApplication.run(CarApplication.class,args);
    }

}
