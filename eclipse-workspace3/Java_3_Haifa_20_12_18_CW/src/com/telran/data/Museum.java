package com.telran.data;

public class Museum extends Place{
	private String[] WorkDays;
	
	public Museum(int id, String name, String city, String address,String[] workDays) {
		super(id, name, city, address);
		this.WorkDays = WorkDays;
		
	}
	
	public String[] workDays() {
		return WorkDays;
	}

}
