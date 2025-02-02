package com.example.demo;

import com.example.demo.config.AppProperties;
import com.example.demo.config.AzureProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ AppProperties.class, AzureProperties.class })
public class ConfigPropertiesDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigPropertiesDemoApplication.class, args);
	}
}
