package com.example.Weather_Forecast_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class WeatherForecastProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(WeatherForecastProjectApplication.class, args);

	}

	@Bean
	public RestTemplate restTemplate() {

		return new RestTemplate();
	}

}
