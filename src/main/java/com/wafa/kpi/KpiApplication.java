package com.wafa.kpi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//annotation spring app
@SpringBootApplication
public class KpiApplication {

	private String message = "hello!"
	public static void main(String[] args) {
		System.out.println(message);
		SpringApplication.run(KpiApplication.class, args);
	}
}
