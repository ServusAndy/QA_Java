package tutorial_5;

public class main {

	public static void main(String[] args) {

		calcSalary(11000);

	}

	public static void calcSalary(float Brutto) {
		float tmp;
		if (Brutto !=0 && Brutto <= 4000) {
			 tmp = Brutto;
			System.out.println("Netto: " + tmp);		
		}
		if (Brutto >= 4001 && Brutto <= 6000) {
			 tmp = (float) (Brutto - (Brutto * 0.1));
			System.out.println("Netto: " + tmp);
		}
		if(Brutto >= 6001 && Brutto <= 8000) {
			tmp = (float) (Brutto - (Brutto * 0.15));
			System.out.println("Netto: " + tmp);
		}
		if(Brutto >= 8001 && Brutto <= 10000) {
			tmp =(float)(Brutto - (Brutto * 0.2));
			System.out.println("Netto: " + tmp);
		}else {
			tmp = (float)(Brutto - (Brutto * 0.25));
			System.out.println("Netto: " + tmp);
		}
	}

}
