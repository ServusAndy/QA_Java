package withgen;

public class GenTest2 {

	public static void main(String[] args) {
		
		Gen<Integer> g1 = new Gen<Integer>(3,4);//mojno tak Gen<Integer> g1 = new Gen<>(3,4);
		Gen<String> g2 = new Gen<String>("Hi","muther fucker");
		
		System.out.println(g1.getA());
		System.out.println(g2.getA());
	}

}
