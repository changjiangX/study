package com.dcits;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient //一个EurekaClient从EurekaServer发现服务
@SpringBootApplication
public class SpringbootMergelyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMergelyApplication.class, args);
    }

}
