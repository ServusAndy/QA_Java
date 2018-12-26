package items;

public abstract class Figure {
	private double x;
	private double y;
	
	public Figure(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x: " + x + " y: " + y;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
}
