package com.telran.data;

public class Employee extends PaymentsPerson implements IFamilyMember{
	private double salary;

	public Employee(String name, String phone, String id, double salary) {
		super(name, phone, id);
		this.salary = salary;

	}

	public Employee(String name, String phone, String id, Payment[] payments, double salary) {
		super(name, phone, id, payments);
		this.salary = salary;

	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

}
