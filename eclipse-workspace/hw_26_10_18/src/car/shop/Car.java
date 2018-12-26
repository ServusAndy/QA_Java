package car.shop;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Car {
	
private static final String[] NAMES_ARRAY = {"Honda","Toyota","VolksWagen","Mercedes","BMW","ZAZ","Hundai","Mitzubisi"}; 

private static final String[] FIRSTNAMES_ARRAY = {"Petya","Jenya","Luba","Lukas","Philip","Vasya","Ira","Grischa"}; 

private static final String[] LASTNAMES_ARRAY = {"Prohorov","Saharov","Lobanov","Savin","Usatov","Palasatov"};
	
	private static final int MAX_YEAR = 2008;

	private static final int MIN_YEAR = 1998;
	
	private static final double MAX_ENGINE = 2.5;
	
	private static final double MIN_ENGINE = 1.4;
	
	private String name;
	private int year;
	private double engine;
	private boolean ac;
	private Person person;

	public Car(String name, int year, double engine, boolean ac,Person person) {
		this.person = person;
		this.name = name;
		this.year = year;
		this.engine = engine;
		this.ac = ac;
	}
	
	public static Car getRandomCar() throws RandomLibraryException{
		
		RandomExt gen = new RandomExt();
		
		String randomName = gen.nextString(NAMES_ARRAY);
		
		int randomYear = gen.nextIntRange(MIN_YEAR, MAX_YEAR);
		
		double randomEngine = gen.nextDoubleRange(MAX_ENGINE, MIN_ENGINE) ;
		
		boolean randomAc = gen.nextBoolean();
		
		String randomFirstName = gen.nextString(FIRSTNAMES_ARRAY);
		
		String randomLastName = gen.nextString(LASTNAMES_ARRAY);
		
		return new Car(randomName,randomYear,randomEngine,randomAc,new Person(randomFirstName, randomLastName));
	}

	@Override
	public String toString() {
		return "Car name: " + name + " year: " + year + " engine: " + String.format("%.1f", engine) + " ac: " + (ac?"with ac":"without ac") + " Owner " + person;
	}

}
