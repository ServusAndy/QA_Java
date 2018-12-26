package not_gen;

public class Gen {
	private Integer a;
	private Integer b;
	
	public Gen(Integer a,Integer b) {
		this.a = a;
		this.b = b;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Gen [a=" + a + ", b=" + b + "]";
	}
	
	
}
