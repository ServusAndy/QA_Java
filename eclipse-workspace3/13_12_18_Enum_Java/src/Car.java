
public class Car {
	public static final int TRUCK =1;
	public static final int REGULAR = 2;
	public static final int SUPER_TRUCK = 3;
	private String model;
	private String manuf;
	//private int type;
	private CarType type;
	
	public Car(String model, String manufac, CarType type) {
		super();
		this.model = model;
		this.manuf = manufac;
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufac() {
		return manuf;
	}
	public void setManufac(String manufac) {
		this.manuf = manufac;
	}
	public CarType getType() {
		return type;
	}
	public void setType(CarType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", manufac=" + manuf + ", type=" + type + "]";
	}
	
	
}
