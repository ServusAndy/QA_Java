package items;

public class Circle extends Figure{
	private double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius>0)this.radius = radius;
		else {
			System.out.println("Wrong size radius!");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " radius: " + radius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
}
