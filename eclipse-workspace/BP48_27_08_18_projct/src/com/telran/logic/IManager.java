package com.telran.logic;

import com.telran.data.Family;
import com.telran.data.IFamilyMember;
import com.telran.data.Payment;

public interface IManager {
	public boolean addFamily(Family family);

	public boolean addMember(IFamilyMember member, Family family);// v family pologit IMember

	public boolean addMember(IFamilyMember member, String familyName);

	public boolean addPayment(IFamilyMember member, Payment payment);//

	public boolean addPayment(Family family, Payment commonPayment);// dobavit obschiy platej v semju;

	public boolean addPayment(String familyName, Payment commnPayment);// dobavit po imeni

	public boolean addPaymentToMember(String memberId, Payment payment);

	public boolean addPaymentToMember(String memberId, String paymentName, String paymentDate, double sum);

	public boolean removeMember(IFamilyMember member);

	public boolean removeMember(String memberId);

	public void printReport(String familyName);

}
