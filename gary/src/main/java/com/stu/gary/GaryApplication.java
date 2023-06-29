package com.stu.gary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages ="com.stu.gary.**.mapper")
public class GaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaryApplication.class, args);
	}
	
	

}
