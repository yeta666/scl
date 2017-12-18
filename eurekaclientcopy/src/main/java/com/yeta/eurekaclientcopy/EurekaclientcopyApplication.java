package com.yeta.eurekaclientcopy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient        //表明这是一个eureka client
@SpringBootApplication
public class EurekaclientcopyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientcopyApplication.class, args);
	}
}
