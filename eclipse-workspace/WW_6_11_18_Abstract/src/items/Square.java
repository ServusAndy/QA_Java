package items;

public class Square extends Figure {
	private double side;

	public Square(double x, double y, double side) {
		super(x, y);
		setSide(side);
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		if (side >= 0)
			this.side = side;
		else {
			System.out.println("Wrong size side!");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " side: " + side;
	}
	
	public double getPerimeter() {
		return 4*side;
	}
	
	public double getArea() {
		return side*side;
	}
}
