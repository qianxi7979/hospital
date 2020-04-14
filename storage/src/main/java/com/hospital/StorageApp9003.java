package com.hospital;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.storage.mapper")
@SpringBootApplication
public class StorageApp9003 {
    public static void main(String[] args) {
        SpringApplication.run(StorageApp9003.class,args);
    }
}
