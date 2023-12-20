package org.soulaimane.inventoryservice;

import org.soulaimane.inventoryservice.entities.Product;
import org.soulaimane.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Phone").price(5347.99)
				.quantity(15).build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("PC").price(9751.91)
					.quantity(7).build());
			productRepository.save(Product.builder().id(UUID.randomUUID().toString()).name("Printer").price(3347.99)
					.quantity(95).build());
		};
	}

}
