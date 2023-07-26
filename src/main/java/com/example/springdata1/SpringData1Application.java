package com.example.springdata1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Lab3 REST API", version = "1.0",
		description = "REST API description...",
		contact = @Contact(name = "Taha Elsayed")),
		security = {@SecurityRequirement(name = "bearerToken")}
)
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@EnableWebMvc
public class SpringData1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringData1Application.class, args);
	}

}
