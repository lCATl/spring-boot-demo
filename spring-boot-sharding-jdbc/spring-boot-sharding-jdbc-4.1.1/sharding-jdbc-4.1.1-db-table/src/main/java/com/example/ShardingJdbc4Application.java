package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author CatQ
 **/
@SpringBootApplication
@MapperScan("com.example.mapper")
public class ShardingJdbc4Application {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbc4Application.class);
    }
}
