package com.sun.insurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableSwagger2
public class StateInsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StateInsuranceApplication.class, args);
	}

	/*
	 * @Bean public Docket productApi() { return new
	 * Docket(DocumentationType.SWAGGER_2).select()
	 * .apis(RequestHandlerSelectors.basePackage("com.tutorialspoint.swaggerdemo")).
	 * build(); }
	 */
}
