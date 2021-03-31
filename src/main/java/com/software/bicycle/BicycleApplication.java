package com.software.bicycle;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Steven
 */
@SpringBootApplication
@MapperScan("com.software.bicycle.dao.mapper")
public class BicycleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BicycleApplication.class, args);
    }

}
