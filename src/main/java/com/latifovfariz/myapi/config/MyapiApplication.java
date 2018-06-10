package com.latifovfariz.myapi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.latifovfariz.myapi"} )
public class MyapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyapiApplication.class, args);
	}
}
