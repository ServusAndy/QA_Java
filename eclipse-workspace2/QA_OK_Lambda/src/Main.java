import java.util.ArrayList;

import lambda_project.Cat;
import lambda_project.ISignable;

public class Main {

	public static void main(String[] args) {
		ArrayList<ISignable> chore = new ArrayList<>();
		
		chore.add(new Cat());
		
		ISignable dog = new ISignable() {
			@Override
			public void sign() {
				System.out.println("Wow wow!");
			}
		};
		chore.add(dog);
		
		chore.add(new ISignable(){
			@Override
			public void sign() {
				System.out.println("Muu muuuu!");
			}
		});
		
		chore.add(()->System.out.println("we we we wewe"));
		
		
		signChorus(chore);
	}

	private static void signChorus(ArrayList<ISignable> chore) {
		for(ISignable signer:chore) {
			signer.sign();
		}
		
	}

}
