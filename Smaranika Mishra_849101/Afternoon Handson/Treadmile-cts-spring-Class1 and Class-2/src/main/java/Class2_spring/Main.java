package Class2_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
		EmployeeService service = (EmployeeService)context.getBean("employeeService");
		service.storeEmployee();
	}

}
