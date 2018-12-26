package com.telran.logic;

import com.telran.data.Family;
import com.telran.data.IFamilyMember;
import com.telran.data.Payment;

public class Manager implements IManager {
	private Family[] families;
	private int count;

	public Manager(int capacity) {
		families = new Family[capacity];
		count = 0;
	}

	@Override
	public boolean addFamily(Family family) {
		if (count >= families.length) {
			Family[] tmp = new Family[families.length * 2];
			for (int i = 0; i < count; i++) {
				tmp[i] = families[i];
			}
			families = tmp;
		}
		if (indexOf(family) < 0) {
			families[count] = family;
			count++;
			return true;
		}

		return false;
	}

	private int indexOf(Family f) {
		for (int i = 0; i < count; i++) {
			if (families[i].equals(f)) {
				return i;
			}
		}
		return -1;
	}

	@Override
	public boolean addMember(IFamilyMember member, Family family) {// member v massiv family
		int indx = indexOf(family);
		if (indx >= 0) {
			IFamilyMember[] fm = families[indx].getMembers();
			if (fm == null) {
				fm = new IFamilyMember[10];
				fm[0] = member;
				families[indx].setMembers(fm);
				return true;
			}

			for (int i = 0; i < fm.length; i++) {
				if (fm[i] != null && fm[i].getId().equals(member.getId())) {
					return false;
				}
				if (fm[i] == null) {
					fm[i] = member;
					families[indx].setMembers(fm);
					return true;
				}
			}

			IFamilyMember[] tmp = new IFamilyMember[fm.length * 2];
			for (int i = 0; i < fm.length; i++) {
				tmp[i] = fm[i];
			}
			tmp[fm.length] = member;
			families[indx].setMembers(tmp);
			return true;
		}
		return false;
	}

	@Override
	public boolean addMember(IFamilyMember member, String familyName) { // po imeni
		Family family = new Family(familyName, null, null);
		return addMember(member, family);
//		int indx = indexOf(family);
//		if(indx>=0) {
//			IFamilyMember[] fm = families[indx].getMembers();
//			if(fm == null) {
//				fm = new IFamilyMember[10];
//				fm[0] = member;
//				families[indx].setMembers(fm);
//				return true;
//			}
//			
//			for(int i = 0; i<fm.length; i++) {
//				if(fm[i] != null && fm[i].getId().equals(member.getId())) {
//					return false;
//				}
//				if(fm[i] == null) {
//					fm[i] = member;
//					families[indx].setMembers(fm);
//					return true;
//				}
//			}
//			
//			IFamilyMember[] tmp = new IFamilyMember[fm.length*2];
//			for(int i = 0; i <fm.length; i++) {
//				tmp[i] = fm[i];		
//			}
//			tmp[fm.length] = member;
//			families[indx].setMembers(tmp);
//			return true;
//		}
//		return false;		
	}

	@Override
	public boolean addPayment(IFamilyMember member, Payment payment) {
		for (int i = 0; i < count; i++) {
			IFamilyMember[] fm = families[i].getMembers();
			if(fm!=null) {
				for(int j = 0; j<fm.length; j++) {
					if(fm[j]!=null) {
						break;
					}else if(fm[j].getId().equals(member.getId())) {
						Payment[] p = fm[j].getPayments();
						if(p == null) {
							p = new Payment[10];
							p[0] = payment;
							fm[j].setPayments(p);
							return true;
						}
						for(int y =0; y<p.length; y++) {
							if(p[y] == null) {
								p[y] = payment;
								return true;
							}
						}
						Payment[] tmp = new Payment[p.length*2];
						for(int y = 0; y < p.length; y++) {
							tmp[y] = p[y];
						}
						tmp[p.length] = payment;
					//	p = tmp;
						fm[j].setPayments(tmp);
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean addPayment(Family family, Payment commonPayment/* платёж */) {
		int indx = indexOf(family);
		if(indx >=0) {
			Payment[] pa = families[indx].getGeneralPayments();
			if(pa == null) {
				pa = new Payment[10];
				pa[0] = commonPayment;
				families[indx].setGeneralPayments(pa);
				return true;
			}
			for(int y =0; y<pa.length; y++) {
				if(pa[y] == null) {
					pa[y] = commonPayment;
					return true;
				}
			}
			Payment[] tmp = new Payment[pa.length*2];
			for(int y = 0; y < pa.length; y++) {
				tmp[y] = pa[y];
			}
			tmp[pa.length] = commonPayment;
		//	pa = tmp;
			families[indx].setGeneralPayments(tmp);;
			return true;
		}
		return false;
	}

	@Override
	public boolean addPayment(String familyName, Payment commonPayment) {
		Family family = new Family(familyName, null, null);
		return addPayment(family,commonPayment);
		//return false;
	}

	@Override
	public boolean addPaymentToMember(String memberId, Payment payment) {

		return false;
	}

	@Override
	public boolean addPaymentToMember(String memberId, String paymentName, String paymentDate, double sum) {

		return false;
	}

	@Override
	public boolean removeMember(IFamilyMember member) {
		for(int i =0; i<count; i++) {
			IFamilyMember[] fm = families[i].getMembers();
			if(fm!= null) {
				for(int j = 0 ; j<fm.length; j++) {
					if(fm[j]!=null && fm[j].getId().equals(member.getId())) {//ispolsovat for removeMember(string id)
						for(;j <fm.length; j++) {
							fm[j] = fm[j+1];
						}
						fm[fm.length] = null;
						return true;
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean removeMember(String memberId) {
		for(int i = 0; i<count; i++) {
			IFamilyMember[] fm = families[i].getMembers();
			if(fm != null) {
				for(int j = 0 ; j<fm.length; j++) {
					if(fm[j]!=null && fm[j].getId().equals(memberId)) {
						
					}
				}
			}
		}
		return false;
	}

	@Override
	public void printReport(String familyName) {
		for(int i = 0; i <count ; i++) {
			if(families[i].getName().equals(familyName)) {
				Family current = families[i];
				IFamilyMember[] members = current.getMembers();
				// check for null
				for(int j = 0 ; j < members.length; j++) {
					Payment[] payments = members[j].getPayments();
					System.out.println("Member: " + (j + 1));
					double total = 0;
					if(payments != null) {
					for(int y = 0 ; y<payments.length; y++) {
						if(payments[y]!=null) {
							System.out.println(payments[y]);
							total += payments[y].getSum();
						}
					}
					System.out.println("Member: " + (j + 1) + " salary: " + members[j].getSalary());
					System.out.println("Current monay: " + (members[j].getSalary() - total));
				}
				Payment[] commons = current.getGeneralPayments();
				//chek for null
				if(commons!=null) {
				for(int j1 = 0 ; j1 < commons.length; j1++) {
					if(commons[j1]!= null) {
					System.out.println(commons[j1]);
					}
				}
			}
		}
	}
	}
	}
}
