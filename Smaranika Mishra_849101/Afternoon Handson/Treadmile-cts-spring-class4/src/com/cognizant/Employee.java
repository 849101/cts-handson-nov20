package com.cognizant;

public class Employee {
 private int ID;
 private String Name;
 private double salary;
public Employee(int iD, String name, double salary) {
	super();
	ID = iD;
	Name = name;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [ID=" + ID + ", Name=" + Name + ", salary=" + salary + "]";
}
 
 
}
