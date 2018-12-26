package hw_9_11_18;

public class Main {

	public static void main(String[] args) {
		
		Cat[] cats = new Cat[1000];
		
		for(int i =0;i<cats.length;i++)cats[i] = new Cat(true);
		System.out.println(cats[0]);
		System.out.println(cats[555]);
		
		System.out.println("===========");
		
		cats[555].wellFedCats(false);
		System.out.println(cats[0]);
		System.out.println(cats[555]);
	}

}
