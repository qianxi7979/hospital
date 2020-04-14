package com.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.presc.mapper")
@SpringBootApplication
public class ApplicationPresc9006 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationPresc9006.class,args);
    }
}
