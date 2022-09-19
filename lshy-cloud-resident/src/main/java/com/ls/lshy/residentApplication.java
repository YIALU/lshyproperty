package com.ls.lshy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ls
 * @create 2022-09-18-10:37
 */

@SpringBootApplication
@EnableDiscoveryClient
public class residentApplication {
    public static void main(String[] args) {
        SpringApplication.run(residentApplication.class,args);
    }
}