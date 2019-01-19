package item;

public class Vehicle {
	private int plateNumber;
	private String model;
	private String color;
	private String vehicleType;
	
	public Vehicle(int plateNumber, String model, String color, String vehicleType) {
		this.plateNumber = plateNumber;
		this.model = model;
		this.color = color;
		this.vehicleType = vehicleType;
	}

	public int getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(int plateNumber) {
		this.plateNumber = plateNumber;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [plateNumber=" + plateNumber + ", model=" + model + ", color=" + color + ", vehicleType="
				+ vehicleType + "]";
	}
	
	
}
