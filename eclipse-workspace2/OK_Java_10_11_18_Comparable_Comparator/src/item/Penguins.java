package item;



public class Penguins implements Comparable<Penguins>{
	
	private double weigth;
	private double price;
	private String name;
	
	public Penguins(double weigth, double price, String name) {
		this.weigth = weigth;
		this.price = price;
		this.name = name;
	}
	
	public double getWeigth() {
		return weigth;
	}
	
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Penguins [weigth=" + weigth + ", price=" + price + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Penguins o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
}
