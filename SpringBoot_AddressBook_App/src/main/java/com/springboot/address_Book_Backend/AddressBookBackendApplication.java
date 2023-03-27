package com.springboot.address_Book_Backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@Slf4j
public class AddressBookBackendApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AddressBookBackendApplication.class, args);
		log.info("Employee Payroll App Started in {} environment",context.getEnvironment().getProperty("environment"));
		log.info("Employee payroll App Database User is {}", context.getEnvironment().getProperty("spring.datasource.username"));
	}

}

