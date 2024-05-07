// Main file 

package com.boa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boa.bean.Customer;

import com.boa.configuration.AppConfig;
import com.boa.service.CustomerService;
import com.boa.service.HelloWorldService;

@SpringBootApplication // Entry Point of your Spring APP
public class SpringMicroServiceCoreBoaApplication {

	public static void main(String[] args) {
	
		ApplicationContext context=SpringApplication.run(AppConfig.class);
		System.out.println("Spring porject is UP set up is ready");
		
		HelloWorldService obj=(HelloWorldService) context.getBean("helloBean");
		System.out.println(obj.sayHelloWorld("by TETS"));
		
		
		ApplicationContext applicationContext2 = SpringApplication.run(AppConfig.class);
		CustomerService customerService = (CustomerService) applicationContext2.getBean("customerService");
		Customer cust = new Customer (1,"test1","test");
		Customer cust1 = new Customer (2,"test2","test");
		customerService.addCustomer(cust);
		customerService.addCustomer(cust1);
		System.out.println(customerService.addCustomer(cust).getCustomerName());
		System.out.println(customerService.addCustomer(cust1).getCustomerName());
		System.out.println(customerService.updateCustomer(2,cust).getCustomerName());
		//System.out.println(customerService.deleteCustomer(2).getCustomerName());
		//System.out.println(customerService.listCustomer().toString());
	}

}


