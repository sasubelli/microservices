package com.boa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.service.CustomerService;
import com.boa.service.CustomerServiceImpl;

@Configuration
public class CustomerConfig {
	@Bean(name="customerService")
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}
}
