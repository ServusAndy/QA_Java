
public enum Manth {
	JAN(31),FEB(30),MAR(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(30),SEP(31),OKT(30),DEC(31);
	
	private int maxDay;
	private int currentDate;
	
	
	 Manth(int currentDate) {
		this.currentDate = currentDate;
	}
}
