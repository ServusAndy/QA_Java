package dto;

public class Gold extends Substance{
	
	private double purity;

	public Gold() {
		super();
	}

	public Gold(double dencity, double purity) {
		super(dencity);
		this.purity = purity;
	}

	public double getPurity() {
		return purity;
	}

	public void setPurity(double purity) {
		this.purity = purity;
	}

	@Override
	public String toString() {
		return " Gold [purity=" + purity + "]";
	}
	
	
}
