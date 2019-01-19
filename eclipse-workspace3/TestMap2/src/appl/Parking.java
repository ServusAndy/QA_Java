package appl;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import item.Vehicle;

public class Parking {
	private HashMap<String,Integer> parkLots;
	private HashMap<String,Integer> occupiedLots;
	private TreeMap<Integer,Vehicle> vehicles;
	
	public Parking(int qtyTruck,int qtyCar, int qtyMoto) 
	{
		parkLots = new HashMap<>();
		parkLots.put("Truck", qtyTruck);
		parkLots.put("Car", qtyCar);
		parkLots.put("Moto", qtyMoto);
		
		occupiedLots = new HashMap<>();
		occupiedLots.put("Truck", 0);
		occupiedLots.put("Car", 0);
		occupiedLots.put("Moto", 0);
		
		vehicles = new TreeMap<>();
	}
	
	public boolean isFull(String vehicleType) {
		
		return parkLots.get(vehicleType)<=occupiedLots.get(vehicleType);
		
	}
	
	public boolean park(Vehicle vehicle) {
		String currentVehicleType = vehicle.getVehicleType();
		if(isFull(currentVehicleType))return false;
		if(vehicles.containsKey(vehicle.getPlateNumber()))return false;
		vehicles.put(vehicle.getPlateNumber(), vehicle);
		occupiedLots.put(currentVehicleType, occupiedLots.get(currentVehicleType)+1);
		return true; 
	}
	
	public Vehicle takeVehicle(int plateNumber) {
		Vehicle currentVehicle = vehicles.remove(plateNumber);
		if(currentVehicle!=null) {
			String currentTypeVehicle = currentVehicle.getVehicleType();
			occupiedLots.put(currentTypeVehicle, occupiedLots.get(currentTypeVehicle)-1);
		}
		return currentVehicle;
	}
	
	public String toString() {
		String res = "";
		for(Map.Entry<Integer, Vehicle> vehicle: vehicles.entrySet()) {
			res = res + vehicle.getValue().toString() + "\n";
		}
		res = res + "Car free parking = " + (parkLots.get("Car")-occupiedLots.get("Car")) + "\n" + 
				 "Truck free parking = " + (parkLots.get("Truck")-occupiedLots.get("Truck")) + "\n" +
				 "Moto free parking = " + (parkLots.get("Moto")-occupiedLots.get("Moto")) + "\n";
		return res;
	}
}
