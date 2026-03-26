package com.rohit.portfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackendApplication.class, args);
		System.out.println("🚀 Portfolio Backend Started!");
		System.out.println("📧 API: http://localhost:8080/api/contacts");
		System.out.println("❤️ Health: http://localhost:8080/api/contacts/health");
	}
}