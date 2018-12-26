package application;

import Model.OurArrayList;

public class OurArrayListTest {

	public static void main(String[] args) {
		
			OurArrayList<Integer> ali = new OurArrayList<Integer>();
			
			//ArrayList<Integer> arr1 = new ArrayList();
			
			ali.add(3);
			ali.add(-2);
			ali.add(8);
			ali.add(11);
			ali.add(-7);
			ali.add(33);
			ali.add(-22);
			ali.add(88);
			ali.add(13);
			ali.add(-77);
			
			ali.add(17);
			ali.add(11);
		    ali.add(-21);
		    
		    System.out.println(ali.size());
		    System.out.println( ali.set(-21, 12));   
		    ali.display();
			System.out.println("==============================================");
			
			System.out.println(ali.remove(6));
			ali.display();
			System.out.println("==============================================");
			
			System.out.println(ali.addByIndex(555, 2));
			ali.display();
			System.out.println("==============================================");
			
			System.out.println(ali.contains(11));
			
			System.out.println(ali.indexOf(88));
			 
		
	}

}
