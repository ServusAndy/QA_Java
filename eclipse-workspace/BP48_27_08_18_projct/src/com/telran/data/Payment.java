package com.telran.data;

public class Payment {
	private String name;
	private String date;
	private double sum;
	
	public Payment(String name, String date, double sum) {
		super();
		this.name = name;
		this.date = date;
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}
	
	public String toString() {
		return name + " " + date + " " + sum;
	}
	
}
