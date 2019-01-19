import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet 
{

	public static void main(String[] args) 
	{
	//	HashSet<Cat> cats = new HashSet<>();
	//	LinkedHashSet<Cat> cats = new LinkedHashSet<>();
		TreeSet<Cat> cats = new TreeSet<>();//ne mojet potomuschto Cat ne Comparable!!!!
		System.out.println(cats.add(new Cat("Murzik",3)));
	//	System.out.println(cats.add(new Cat("Murzik",3)));
	//	System.out.println(cats.add(new Cat("Murzik",3)));
		System.out.println(cats.add(new Cat("Vasya",4)));
		System.out.println(cats.add(new Cat("Murzik",2)));
		
	//	System.out.println(cats.contains(new Cat("Murzik",3)));
	//	System.out.println(cats.size());
	//	Object[] catsArr = cats.toArray();
	//	Cat[] catsArr2 = cats.toArray(Cat[] c);
//		cats.remove(new Cat("Murzik",3));
//		
		for(Cat c:cats) 
		{
		System.out.println(c);	
		//cats.remove(c);
		}
//		
//		Iterator<Cat> iter = cats.iterator();
//		while(iter.hasNext()) 
//		{
//			Cat c = iter.next();
//			if(c.getName().equals("Vasya")) iter.remove();
//		}
//		
//		System.out.println(cats.size());
		
	}

}
