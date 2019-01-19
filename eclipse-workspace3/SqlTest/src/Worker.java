import randomLib.RandomExt;

public class Worker implements Comparable<Worker>{
	
	private static final String[] FIRST_NAMES_ARRAY = {"Sascha","Mascha","Dascha","Pascha","Glascha","Arcascha","Mischa","Moischa","Natascha","Abrascha","Kolya","Vasya","Vitalik",
			"Igor","Oleg","Konstantin"};

	private static final String[] LAST_NAMES_ARRAY = {"Schmotkin","Petkin","Vasechkin","Durakov","Sumkin","Tankanjan","Malakanjan","Vodochkin","Petruschkin","Pomidorov",
			"Galustyn","Petrasyan","Bakenbetov","Osechkin","Alkaschinskiy","Krivorukov","Petrushkin","Mandarinkin","Lomonosov","Krepishkin",
			"Dolgodumskiy","Nudnyansky","Savkovskiy"};

	private static final String[] POSITION_ARRAY = {"Manager","Programmer","QA-Engener","Produser","database administrator","network administrator","systems analyst"};

	private static RandomExt gen = new RandomExt();
	
	private String firstName;
	private String lastName;
	private String position;

	public Worker() {
	}

	public Worker(String firstName, String lastName, String position) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "FirstName: " + firstName + " LastName: " + lastName + " Position: " + position;
	}

	public static Worker getRandomWorker() {
		String randomFirstName = gen.nextString(FIRST_NAMES_ARRAY);

		String randomLastName = gen.nextString(LAST_NAMES_ARRAY);

		String randomPosition = gen.nextString(POSITION_ARRAY);

		return new Worker(randomFirstName, randomLastName, randomPosition);
	}

	@Override
	public int compareTo(Worker w) {
		
		return this.lastName.compareTo(w.getLastName());
	}
}
