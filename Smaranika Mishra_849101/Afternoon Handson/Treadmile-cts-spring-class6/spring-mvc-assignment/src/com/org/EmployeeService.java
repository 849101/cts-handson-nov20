package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
    @Autowired
	private EmployeeDao dao;
    
    public void addEmployee(@Autowired Employee e) {
    	dao.save(e);
    }
    
    public void deleteEmployee(int i) {
    	dao.delete(i);
    }
}
