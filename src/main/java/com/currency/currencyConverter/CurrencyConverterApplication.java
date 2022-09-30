package com.currency.currencyConverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication

@ComponentScan({"com/currency/currencyConverter/configuration"})
@ComponentScan({"com/currency/currencyConverter/controllers"})
@ComponentScan({"com/currency/currencyConverter/models"})
@ComponentScan({"com/currency/currencyConverter/services"})
@ComponentScan({"com/currency/currencyConverter/tasks"})
@ComponentScan({"com/currency/currencyConverter/repositories"})

@EnableScheduling
public class CurrencyConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterApplication.class, args);
	}
}
