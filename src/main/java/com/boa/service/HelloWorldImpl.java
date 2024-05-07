
// Impl 
/**
 * 
 */
package com.boa.service;



/**
 * @author Dell
 *
 */
public class HelloWorldImpl implements HelloWorldService{

	@Override
	public String sayHelloWorld(String msg){
		// TODO Auto-generated method stub
		System.out.println("In the Service Method");
		return "Hello World Sevice with Call name-->" +msg;
	}

}
