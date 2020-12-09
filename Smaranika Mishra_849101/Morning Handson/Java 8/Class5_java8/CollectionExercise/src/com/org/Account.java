package com.org;

public class Account {
private String name;
private int accno;
private double amount;
public Account(String name, int accno, double amount) {
	super();
	this.name = name;
	this.accno = accno;
	this.amount = amount;
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAccno() {
	return accno;
}
public void setAccno(int accno) {
	this.accno = accno;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Account [name=" + name + ", accno=" + accno + ", amount=" + amount + "]";
}


}
