package com.boa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.boa.bean.Customer;
import com.boa.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	List<Customer> customers = new ArrayList<>();

	@Override
	public Customer addCustomer(Customer name) {
		Customer customer = new Customer();
		customer.setCustomerId(name.getCustomerId());
		customer.setCustomerName(name.getCustomerName());
		customer.setCustomerAddress(name.getCustomerAddress());
		customers.add(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(int custId,Customer cust) {
		Customer customer = new Customer();
		customers.remove(custId);
		customer.setCustomerId(cust.getCustomerId());
		customer.setCustomerName(cust.getCustomerName());
		customer.setCustomerAddress(cust.getCustomerAddress());
		customers.add(customer);
		return customer;
	}

	@Override
	public Customer deleteCustomer(Integer id) {
		Customer customer = new Customer();
		customer.setCustomerId(id);
		customers.remove(customer);
		return customer;
	}

	@Override
	public List<Customer> listCustomer() {
		
	return customers;
	}

	
}
