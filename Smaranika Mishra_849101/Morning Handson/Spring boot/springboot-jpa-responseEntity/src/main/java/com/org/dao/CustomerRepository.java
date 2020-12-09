package com.org.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
