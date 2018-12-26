package com.telran.data;

public interface IFamilyMember {
	public Payment[] getPayments();
	public double getSalary();
	public String getId();
	public void setPayments(Payment[] payments);
}
