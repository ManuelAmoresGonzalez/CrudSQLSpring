package com.DatabaseExample.CrudSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudSqlApplication {

	public static void main(String[] args) {
		try{
			SpringApplication.run(CrudSqlApplication.class, args);
		}catch (Exception exception) {
			exception.getMessage();
			exception.printStackTrace();
		}

	}
}
