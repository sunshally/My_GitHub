package com.sun.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.sun.springboot.mapper")
@SpringBootApplication
public class MyWebService {

	public static void main(String[] args) {
		SpringApplication.run(MyWebService.class, args);
	}
}
