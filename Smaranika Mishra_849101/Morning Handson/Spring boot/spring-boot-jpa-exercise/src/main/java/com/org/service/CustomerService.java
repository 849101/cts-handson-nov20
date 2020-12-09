package com.org.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.dao.CustomerRepository;
import com.org.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository dao;
	
	public Customer addCustomer(Customer customer)
	{
		Customer newCustomer=dao.save(customer);
		return newCustomer;
	}
	public List<Customer> fetchAllCustomers()
	{
		return dao.findAll();
	}
	public Customer fetchCustomerById(int id)
	{
	   Optional<Customer> option = dao.findById(id);
	   if(option.isPresent())
		   return option.get();
	   else
		   return null;
    }
	public void deleteCustomer(int id)
	{
		dao.deleteById(id);
	}
	public Customer updateCustomer(int id,LocalDate dob)
	{
		Customer cust =fetchCustomerById(id);
		if(cust != null) {
			cust.setDob(dob);
		    return dao.save(cust);
		}
		else
			return null;
		    
	}
	
	
	/*private static List<Customer> custDatabase=new ArrayList<Customer>();
	public Customer addCustomer(Customer customer)
	{
		customer.setCustomerId((int)(Math.random()*1234));
		custDatabase.add(customer);
		return customer;
	}
	public List<Customer> fetchCustomers()
	{
		return custDatabase;
	}
	public Customer fetchCustomerById(int id)
	{
		return custDatabase.stream().filter(e -> e.getCustomerId() == id)
				.findAny().get();
	} */
	
}
