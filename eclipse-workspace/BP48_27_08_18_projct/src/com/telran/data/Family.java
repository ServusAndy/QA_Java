package com.telran.data;

public class Family {
	private IFamilyMember[] members;
	private Payment[] generalPayments;//obshiy platej
	private String name;

	public Family(String name, IFamilyMember[] members, Payment[] generalPayments) {
		super();
		this.members = members;
		this.generalPayments = generalPayments;
		this.name = name;

	}

	public IFamilyMember[] getMembers() {
		return members;
	}

	public void setMembers(IFamilyMember[] members) {
		this.members = members;
	}

	public Payment[] getGeneralPayments() {
		return generalPayments;
	}

	public void setGeneralPayments(Payment[] generalPayments) {
		this.generalPayments = generalPayments;
	}

	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " " + members + " " + generalPayments;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Family)) {
			return false;
		}
		Family other = (Family) obj;
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}

}
