package com.eazybytes.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts Microservice REST API Documentation",
				description = "Microservice created by Olaya Sánchez",
				version = "v1",
				contact = @Contact(
						name = "Olaya Sánchez",
						email = "olaya@info.com",
						url = "https://olaya.info"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://apache.version"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "External Documentation for Accounts Microservice REST API",
				url = "https://swaggerdoc.info"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
