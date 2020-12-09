package com.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountService {

	List<Account> list = new ArrayList<Account>();
	public void addAccount(Account a) throws AccountAlreadyException {
		list.add(a);
	}
	public List<Account> removeAccount(int accno) throws AccountNotFoundException{
		 Iterator<Account> it = list.iterator();
		    while(it.hasNext()){
		        Account account = it.next();
		        if(account.getAccno()==accno){
		            it.remove();
		            break;
		        }
		    }
		    return list;
	}
	public List<Account> displayByAccno(int accno) throws AccountNotFoundException{
	List<Account> checkList = new ArrayList<Account>();
	for(Account account : list) {
		if(account.getAccno()==accno) {
			checkList.add(account);
		}
	}
	return checkList;
	}
	public void displayAll(){
		for(Account ac : list) {
			System.out.println(ac.getName()+" "+ac.getAccno()+" "+ac.getAmount());
		}
	}
		public List<Account> display(){
			List<Account> la = new ArrayList<Account>();
			for(Account a :list) {
				if(a.getAmount()<1000) {
					la.add(a);
				}
			}
			return la;
		}
	}
	
	

