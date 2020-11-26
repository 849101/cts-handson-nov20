package com.org;
//package com.org;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		EmployeeService service = (EmployeeService) context.getBean("employeeService");
//		Employee emp = new Employee();
//		emp.setId(106);
//		emp.setName("Frank");
//		emp.setSalary(83000);
//		service.storeEmployee(emp);
		
//		Employee emp = service.fetchEmployeeById(101);
//		System.out.println("Id = "+emp.getId()+", Name = "+emp.getName()+", Salary = "+emp.getSalary());
		
		List<Employee> list = service.fetchAllEmployees();
		list.forEach(e -> System.out.println(e));
	}
}
