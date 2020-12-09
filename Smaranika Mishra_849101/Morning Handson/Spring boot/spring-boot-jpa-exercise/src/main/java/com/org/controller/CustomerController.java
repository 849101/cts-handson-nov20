package com.org.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.model.Customer;
import com.org.service.CustomerService;

@RequestMapping("customer")
@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer createCustomerApi(@RequestBody Customer customer)
	{
		Customer newCustomer=customerService.addCustomer(customer);
		return newCustomer;
	}
	@GetMapping
	public List<Customer> getAllCustomers()
	{
		return customerService.fetchAllCustomers();
	}
	@GetMapping("{customerId}")
	public Customer getCustomerById(@PathVariable("customerId") int id)
	{
		Customer customer=customerService.fetchCustomerById(id);
		return customer;
	}
	@PutMapping("{customerId}/{dob}")
	public Customer updateCustomerDob(@PathVariable("customerId") int id,@PathVariable("dob") String newDob)
	{
	
		return customerService.updateCustomer(id, LocalDate.parse(newDob));
	}
	@GetMapping("delete/{customerId}")
	public void deleteCustomer(@PathVariable("customerId") int id)
	{
		customerService.deleteCustomer(id);
	}
}
