package com.boa.service;
import java.util.List;

import com.boa.bean.Customer;

public interface CustomerService {

	public  Customer addCustomer(Customer cust);
	public  Customer updateCustomer(int custId,Customer cust);
	public Customer deleteCustomer(Integer custId);
	public List<Customer> listCustomer();

	
}
