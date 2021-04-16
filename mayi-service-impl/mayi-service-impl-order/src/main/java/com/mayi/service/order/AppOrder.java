package com.mayi.service.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version V1.0
 * @Author mingjun.fan
 * @Description
 * @Date 17:59 2021/3/31
 **/
@SpringBootApplication
@EnableFeignClients
public class AppOrder {
    public static void main(String[] args) {
        SpringApplication.run(AppOrder.class);
    }
}
