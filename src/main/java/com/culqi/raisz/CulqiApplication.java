package com.culqi.raisz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.culqi.raisz")
public class CulqiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CulqiApplication.class);
	}

}
