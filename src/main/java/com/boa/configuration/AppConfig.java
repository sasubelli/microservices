
// AppConfig 

/**
 * 
 */
package com.boa.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Dell
 *
 */
@Configuration
@Import({HelloWorldConfig.class,CustomerConfig.class})
public class AppConfig {

	/*@Bean(name="helloBean")
	public HelloWorld helloWorld() {
		
		return new HelloWorldImpl();
	}
	
	@Bean(name="customerService")
	public CustomerService customerService() {
		return new CustomerServiceImpl();
	}*/
}
