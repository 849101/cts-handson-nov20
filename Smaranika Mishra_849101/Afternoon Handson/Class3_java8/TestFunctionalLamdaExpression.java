package Class3_java8;

import java.time.LocalDate;
import java.util.Scanner;

public class TestFunctionalLamdaExpression {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		Employee_Service service=new Employee_Service();
		int x=1,n;
		do {
			System.out.println("1. Add an employee");
			System.out.println("2. Find the employee by Id");
			System.out.println("3. Display the Employee List");
			System.out.println("4. Sort the Employee List by Id");
			System.out.println("5. Sort the Employee List by Name");
			System.out.println("6. Sort the Employee List by Salary");
			System.out.println("7. Sort the Employee List by D.O.B");
			System.out.println("8. Exit");
			
			n=in.nextInt();
			
			switch(n) {
			case 1:
			{
				System.out.println("Enter the id of the employee");
				int a=in.nextInt();
				System.out.println("Enter the name of the employee");
				String b=in.next();
				System.out.println("Enter the salary of the employee");
				int c=in.nextInt();
				System.out.println("Enter the Date of Birth of the employee// Format: yyyy-MM-dd");
				String e=in.next();
				LocalDate d= LocalDate.parse(e);
				service.add(new Employee(a,b,c,d));
				break;
			}
			case 2:
			{
				System.out.println("Enter the employee id to be searched");
				int a=in.nextInt();
				System.out.println(service.find(a));
				break;
			}
			case 3:
			{
				System.out.println("The LIST");
				service.display().forEach(item -> System.out.println(item));
				break;
			}
			
			case 4:
			{
				System.out.println("The LIST sorted by ID in Ascending order");
				service.sortID();
				service.display().forEach(item ->System.out.println(item));
				break;
			}
			
			case 5:
			{
				System.out.println("The LIST sorted by Name in Ascending order");
				service.sortName();
				service.display().forEach(item -> System.out.println(item));
				break;
			}
			
			case 6:
			{
				System.out.println("The LIST sorted by Salary in Ascending order");
				service.sortSalary();
				service.display().forEach(item->System.out.println(item));
				break;
			}
			
			case 7:
			{
				System.out.println("The LIST sorted by Date of Birth in Ascending order");
				service.sortDOB();
				service.display().forEach(item->System.out.println(item));
				break;
			}
			
			case 8:
			{
				x=0;
				break;
			}
				
			}
		}while(x==1);
		System.out.println("Thank You");
		in.close();
	}

}

