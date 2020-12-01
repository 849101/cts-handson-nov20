package com.org;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	public void store() {
		System.out.println("store() method  in EmployeeService");
	}
	
	public void delete() {
		System.out.println(" delete() method in EmployeeService ");
	}
	public void getEmployee(int num) {
		System.out.println("getEmployee() method in employe service");
	}
	public String getEmployees(int num,Double gem) {
		System.out.println("getEmployees methos in service");
		return "hi";
	}
	public void updateEmployee(int id, String name) {
		System.out.println("updatteEmployee methpd in service");
	}

}