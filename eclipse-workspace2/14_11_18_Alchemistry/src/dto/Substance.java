package dto;

public class Substance {
	private double dencity;

	public Substance() {
		super();
	}

	public Substance(double dencity) {
		super();
		this.dencity = dencity;
	}

	public double getDencity() {
		return dencity;
	}

	public void setDencity(double dencity) {
		this.dencity = dencity;
	}

	@Override
	public String toString() {
		return "Substance [dencity=" + dencity + "]";
	}
	
	
}
