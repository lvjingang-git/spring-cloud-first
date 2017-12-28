package com.lv.jingang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ProviderApplicationTwo {
    public static void main( String[] args ) {
        SpringApplication.run(ProviderApplicationTwo.class,args);
    }
}
