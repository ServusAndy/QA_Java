package test.car.shop;

import car.shop.Car;
import randomLib.RandomLibraryException;

public class Main {
	
	private static final int NUM_CARS = 10;

	public static void main(String[] args) throws RandomLibraryException{
		
		for(int i = 0 ; i<NUM_CARS; i++)System.out.println(Car.getRandomCar()); 
	}

	
}
