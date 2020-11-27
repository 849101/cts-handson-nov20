package com.cognizant;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public String fetchDateTimeService() {
		return dao.fetchDateTime();
	}
	
	public List<Employee> getAllEmployeesNamesInReverseOrder() {
		List<Employee> list = dao.fetchAllEmployees().stream()
		.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
		.collect(Collectors.toList());
		return list;
}
	public List<Employee> getEmployeeNameInAscOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeIDInAscOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> e1.getID()-e2.getID())
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeIDInDescOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> e2.getID()-e1.getID())
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeSalaryInAscOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
				.collect(Collectors.toList());
				return list;
	}
	
	public List<Employee> getEmployeeSalaryInDescOrder(){
		List<Employee> list = dao.fetchAllEmployees().stream()
				.sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
				.collect(Collectors.toList());
				return list;
	}
	public Employee fetchEmployee(int id) {
		return dao.fetchEmployee(id);
	}
	
}

