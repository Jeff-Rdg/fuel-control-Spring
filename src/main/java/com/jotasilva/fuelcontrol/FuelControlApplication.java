package com.jotasilva.fuelcontrol;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Fuel Control API",
				version = "1.0.0",
				description = "API para realização de controle de abastecimento de veículos de uma empresa.",
				contact = @Contact(
						name = "Jefferson Rodrigues",
						email = "jsilvardg@outlook.com"
				),
				license = @License(
						name = "",
						url = ""
				),
				termsOfService = ""
		)
)
public class FuelControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(FuelControlApplication.class, args);
	}

}
