package com.offcn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.offcn.mapper")   //声明mybatis扫描mapper接口所在包
public class SpringbootandmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootandmybatisApplication.class, args);
    }

}
