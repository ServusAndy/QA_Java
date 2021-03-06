package appl;

import java.util.Arrays;
import java.util.Comparator;

import comparators.ComparatorByAge;
import item.Cats;

public class CatsTest{
	
	public static void main(String[] args) {
		Cats c1 = new Cats(1111,"Vasya",2);
		Cats c2 = new Cats(1112,"Murzik",3);
		Cats c3 = new Cats(1114,"Masha",1);
		Cats c4 = new Cats(1113,"Pusik",4);
		Cats c5 = new Cats(1118,"Yakov Borisovich",9);
		
		Cats[] cats = {c1,c2,c3,c4,c5};
		//System.out.println(cats);
		//System.out.println(Arrays.toString(cats));
		display(cats);
		//=========================================
		//Arrays.sort(cats);
		//display(cats);
		//=========================================
		ComparatorByAge cba = new ComparatorByAge();
		Arrays.sort(cats, cba);
		display(cats);
		//=============================================
		Arrays.sort(cats,new Comparator<Cats>() {

			@Override
			public int compare(Cats o1, Cats o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		display(cats);
		//============================================
		
		//(параметры) -> {условие}
		//========================================
		Arrays.sort(cats,(o1,o2)->o2.getName().compareTo(o1.getName()));
		display(cats);
		//=============================================
		Comparator<Cats> c = (o1,o2) -> o1.getId()-o2.getId();
		
		Arrays.sort(cats, c);
		display(cats);
		
	}

	private static void display(Cats[] cats) {
		for(Cats cat:cats) {
			System.out.println(cat);
		}
		System.out.println("====================================");
	}
}
