package com.telran.data;

public class PaymentsPerson extends Person {
	private Payment[] payments;

	public PaymentsPerson(String name, String phone, String id, Payment[] payments) {
		super(name, phone, id);
		this.payments = payments;

	}

	public Payment[] getPayments() {
		return payments;
	}

	public void setPayments(Payment[] payments) {
		this.payments = payments;
	}

	public PaymentsPerson(String name, String phone, String id) {
		super(name, phone, id);
	}	

}
