package tutorial;

public class TestClass {
	private String a = new String();
	int[] arr = new int[10];
	
	public TestClass(String a) {
	this.setA(a);	
		
	}
	
	public double calcWightofMoon(double x, double y) {
		
		return x * y; 
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
}
