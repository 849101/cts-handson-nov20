package com.cognizant;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public String fetchDateTime() {
		return LocalDateTime.now().toString();
	}
	
	public List<Employee> fetchAllEmployees(){
		return jdbcTemplate.query("select * from Employee", 
				(rs,num) -> new Employee(rs.getInt("id"), rs.getString("Name"), 
						rs.getDouble("salary")));
	}
	public Employee fetchEmployee(int id) {
		return jdbcTemplate.queryForObject("select * from employee where id = ?", new Object[] {id}, 
				(rs, num) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getDouble("salary")));
	}
}
