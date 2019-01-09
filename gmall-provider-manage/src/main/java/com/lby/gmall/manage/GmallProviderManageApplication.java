package com.lby.gmall.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.lby.gmall.manage.mapper")
public class GmallProviderManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallProviderManageApplication.class, args);
    }

}

