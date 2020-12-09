package com.org;


import java.util.List;
import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) throws AccountAlreadyException, AccountNotFoundException {
	AccountService s= new AccountService();
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the menu");
	while(true) {
		System.out.println("Enter 1 to add account");
		System.out.println("Enter 2 to remove account by acc_no");
		System.out.println("Enter 3 to display account by acc_no");
		System.out.println("Enter 4 to display all accounts");
		System.out.println("Enter 5 to display account whose balance is less than 1000");
		System.out.println("Enter 6 to exit");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
		
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter acc no");
			int accno=sc.nextInt();
			System.out.println("Enter amount");
			double amount=sc.nextDouble();
			Account ac = new Account(name, accno, amount);
			try {
				s.addAccount(ac);
			}
			catch(AccountAlreadyException e){
			
			
				if(ac.getAccno()==accno) {
					
					throw new AccountAlreadyException(e);
				}
				System.out.println("Account already exists");
			}
		
		
			
			break;
			
		case 2:
			System.out.println("Enter acc no to be removed");
		int no=sc.nextInt();
		Account acc= new Account();
		try {
		List<Account> al = s.removeAccount(no);
		al.forEach(e -> System.out.println(e));
		}
		catch(AccountNotFoundException e) {
			if(acc.getAccno()!=no) {
				throw new AccountNotFoundException(e);
			}
			System.out.println("Accunt no does not exist");
		}
		break;
		
		case 3:
			System.out.println("Enter acc no to searched");
			int n=sc.nextInt();
			Account a = new Account();
			try {
				List<Account> la = s.displayByAccno(n);
				la.forEach(e -> System.out.println(e));
			}
			catch(AccountNotFoundException e) {
				if(a.getAccno()!=n) {
					throw new AccountNotFoundException(e);
				}
				System.out.println("Accunt no does not exist");
			}
			break;
		case 4:
			s.displayAll();
			break;
		case 5:
			List<Account> x = s.display();
			x.forEach(e -> System.out.println(e));
			break;
		case 6:
			System.out.println("Exiting the application");
			System.exit(0);
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
		}
	}
	
}
}

	


