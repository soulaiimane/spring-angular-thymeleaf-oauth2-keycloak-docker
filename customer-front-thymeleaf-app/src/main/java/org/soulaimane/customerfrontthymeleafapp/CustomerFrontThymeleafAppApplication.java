package org.soulaimane.customerfrontthymeleafapp;

import org.soulaimane.customerfrontthymeleafapp.entities.Customer;
import org.soulaimane.customerfrontthymeleafapp.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class CustomerFrontThymeleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThymeleafAppApplication.class, args);
    }
    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(Customer.builder().name("Ahmed").email("Ahmed@gmail.com").build()
            );
            customerRepository.save(Customer.builder().name("Hassane").email("Hassane@gmail.com").build()
            );
            customerRepository.save(Customer.builder().name("Khalid").email("Khalid@gmail.com").build()
            );
            customerRepository.save(Customer.builder().name("Said").email("Said@gmail.com").build()
            );
            customerRepository.save(Customer.builder().name("Hamza").email("Hamza@gmail.com").build()
            );
        };

    }

}
