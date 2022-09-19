package com.ls.lshy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ls
 * @create 2022-09-18-11:39
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class adminApplication {
    public static void main(String[] args) {
        SpringApplication.run(adminApplication.class,args);
    }

}
