package dto;

public class Shit extends Substance{
    private String color;

	public Shit() {
		super();
	}

	public Shit(double dencity, String color) {
		super(dencity);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
    
}
