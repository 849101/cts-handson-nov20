package com.org;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Employee e) {
		String query="insert into employee (ID,Name,salary) values(?,?,?)";
		jdbcTemplate.update(query,e.getID(), e.getName(), e.getSalary());
	}
	public void delete(int id) {
		String query="delete from employee where id=?";
		jdbcTemplate.update(query, id);
	}
	
	
}
