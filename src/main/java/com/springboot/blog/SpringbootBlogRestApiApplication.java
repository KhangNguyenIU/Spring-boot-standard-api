package com.springboot.blog;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title= "Spring Boot Blog Rest Apis",
				description = "A Spring Boot Rest API follows standard API documentation",
				version= "1.0",
				contact = @Contact(
						name = "Duy Khang",
						email = "jucember92@gmail.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "A Spring Boot Rest API follows standard API documentation",
				url = "https://github.com/KhangNguyenIU/Spring-boot-standard-api"
		)
)
public class SpringbootBlogRestApiApplication {

	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBlogRestApiApplication.class, args);
	}

}
