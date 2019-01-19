package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import appl.Parking;
import item.Vehicle;

class TestParking {

	int QTY_CAR = 3;
	int QTY_TRUCK = 2;
	int QTY_MOTO = 2;
	Parking parking;
	
	Vehicle moto1;
	Vehicle moto2;
	Vehicle moto3;
	
	Vehicle car1;
	Vehicle car2;
	Vehicle car3;
	
	Vehicle truck1;
	Vehicle truck2;
	Vehicle truck3;
	
	@BeforeEach
	void setUp() throws Exception {
		moto1 = new Vehicle(322,"Suzuki","Red","Motorcicle");
		moto2 = new Vehicle(111,"Honda","Red","Motorcicle");
		
		car1 = new Vehicle(231,"Toyota","Black","Car");
		car2 = new Vehicle(232,"Kia","White","Car");
		car3 = new Vehicle(231,"mazda","Red","Car");
		
		truck1 = new Vehicle(555,"CAT","Yellow","Truck");
		truck2 = new Vehicle(111,"CAT","Red","Truck");
		truck3 = new Vehicle(111,"CAT","Red","Truck");
		
		parking = new Parking(QTY_TRUCK,QTY_CAR,QTY_MOTO);
	}

	@Test
	void testFull() {
		assertFalse(parking.isFull("Truck"));
		parking.park(truck1);
		parking.park(truck2);
		assertTrue(parking.isFull("Truck"));
	}
	

	@Test
	void testPark() {
		assertTrue(parking.park(truck1));
	}

}
