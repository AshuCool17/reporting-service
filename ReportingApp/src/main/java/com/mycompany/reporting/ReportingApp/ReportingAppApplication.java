package com.mycompany.reporting.ReportingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ReportingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReportingAppApplication.class, args);
	}

}
