package appl;

import Inter.*;
import items.*;


public class AnimalsTest {

	public static void main(String[] args) {
		
//		Animals cat = new Cat("kind of cat","cats","Barsik","Orange");
//		Animals dog = new Dog("kind of dog","dogs","Barsa");
//		Animals tuki = new Tuki("chord","birds","Gosha",2,"Rad");
		
		Cat cat = new Cat("kind of cat","cats","Barsik","Orange");
		Dog dog = new Dog("kind of dog","dogs","Barsa");
		Tuki tuki = new Tuki("chord","birds","Gosha",2,"Rad");
		
		Animals[] animalArr = {cat,dog,tuki};
		
		
		for(int i = 0; i<animalArr.length;i++) {
			if(animalArr[i] instanceof IBarkable) {
				System.out.println(animalArr[i]);
				((IBarkable)animalArr[i]).bark();
			}
		}
		
		IBarkable[] barArr =  {tuki,dog};
		
	}

}
