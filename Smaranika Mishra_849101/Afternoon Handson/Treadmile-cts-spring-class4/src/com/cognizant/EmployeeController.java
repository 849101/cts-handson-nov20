package com.cognizant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@RequestMapping(value = "/time", method = RequestMethod.GET)
	public ModelAndView viewDateTime() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchDateTimeService());
		return mav;
	}
	
	@RequestMapping(value = "/sortByNameReverse", method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInReverseOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getAllEmployeesNamesInReverseOrder());
		return mav;
	}
	
	@RequestMapping(value="/sortByNameAsc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesNameInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeNameInAscOrder());
		return mav;
	}
	@RequestMapping(value="/sortByIdAsc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeIDInAscOrder());
		return mav;
	}
	@RequestMapping(value="/sortByIdDesc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesIdInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeIDInDescOrder());
		return mav;
	}
	@RequestMapping(value="/sortBySalaryAsc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInAscOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalaryInAscOrder());
		return mav;
	}
	@RequestMapping(value="/sortBySalaryDesc" , method = RequestMethod.GET)
	public ModelAndView viewAllEmployeesSalaryInDescOrder() {
		ModelAndView mav = new ModelAndView("hello", "msg", service.getEmployeeSalaryInDescOrder());
		return mav;
	}
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
	public ModelAndView extractEmployee(@RequestParam("employeeId") int empId) {
		ModelAndView mav = new ModelAndView("hello", "msg", service.fetchEmployee(empId));
		return mav;
	}
}

