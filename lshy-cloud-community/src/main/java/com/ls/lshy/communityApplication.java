package com.ls.lshy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ls
 * @create 2022-09-18-17:16
 */
@EnableDiscoveryClient
@SpringBootApplication
public class communityApplication {
    public static void main(String[] args) {
        SpringApplication.run(communityApplication.class,args);
    }
}
