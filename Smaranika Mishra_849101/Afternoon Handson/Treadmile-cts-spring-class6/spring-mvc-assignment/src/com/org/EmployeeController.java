package com.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {


		
        @Autowired
        private EmployeeService service;
        @RequestMapping(value="/addemp")
        public String addEmp(ModelMap m) {
        	
        	m.addAttribute("employee", new Employee());
        	return "addemp";
        }
        @PostMapping(value="/addemp")
        public String addEmp(@ModelAttribute("employee") @Validated Employee emp,BindingResult res,ModelMap model) {
        	if(res.hasErrors()){
    			return "addemp";
    		}
        	service.addEmployee(emp);
        	return "Successadd";
        }
        @RequestMapping(value="/delemp")
        public String delEmp(ModelMap m, @RequestParam int empid) {
        	
        	m.addAttribute("employee", new Employee());
        	m.put("empid", empid);
        	return "delemp";
        }
        @PostMapping(value="/delemp")
        public String delEmp( @ModelAttribute("employee") Employee emp, ModelMap m ) {
        	int id = (int) m.get("empid");
		if(id!=emp.getID()) {
			return "Sorry";
		}
        	service.deleteEmployee(id);
        	return "SuccessDel";
	}
}


