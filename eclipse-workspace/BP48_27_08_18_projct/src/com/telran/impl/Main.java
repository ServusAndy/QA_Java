package com.telran.impl;

import com.telran.data.*;
import com.telran.logic.*;


public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager(10);
		
			IFamilyMember[] member = null;
			Payment[] p = null;
			Family f1 = new Family("Petkini",member , p);
			Family f2 = new Family("Sumkini", null, null);
			IFamilyMember member1 = new Employee("Kostik","053666999", "8822", 3500);
			IFamilyMember member2 = new Employee("Petja","053777999", "4422", 4000);
			Payment p1 = new Payment("Tolik", "04.06.18", 2500);
			
			manager.addFamily(f1);
			manager.addMember(member2, "Petkini");
			manager.addPayment(member2, p1);
			
		
			
		
			
			
			
			
			PaymentsPerson pp1 = new PaymentsPerson("Tolik", "123456789","3344");
			
			
			
			
			
			manager.printReport("Petkini");

	}

}
