
package com.boa.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boa.bean.HelloWorld;
import com.boa.service.HelloWorldImpl;
import com.boa.service.HelloWorldService;

/**
* @author Dell
*
*/
@Configuration
public class HelloWorldConfig {

	@Bean(name="helloBean")
	public HelloWorldService  HelloWorldService() {		
		return   new HelloWorldImpl();
	}

}
