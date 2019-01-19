package item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import randomLib.RandomExt;
import randomLib.RandomLibraryException;

public class Roulette {
	
	static RandomExt gen = new RandomExt();

	private static int getIntFromConsole() throws IOException {
		return Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine().trim());
	}
	
	
	public static String GuessTheNumber() throws RandomLibraryException, IOException {
		int roulette = gen.nextIntRange(1, 10);
		int input = 0;
		while(true) {
		//	System.out.println(roulette);
			System.out.println("Guess the Number from 1 to 10");
			try {
				input = getIntFromConsole();
			} catch (NumberFormatException e) {
				System.out.println("Enter only Integer!");
			}	
			if(input==roulette) {
			return "Сongratulations!!! You guessed,it was: " + roulette;
			}else {
				System.out.println("Try once more");
				return GuessTheNumber();
			}
		}
	}
	
	public static void GuessTheStableNumber() throws RandomLibraryException, IOException {
		int roulette = gen.nextIntRange(1, 10);
		int input = 0;
		while(input!=roulette) {
		//	System.out.println(roulette);
			System.out.println("Guess the Number from 1 to 10");
			try {
				input = getIntFromConsole();
			} catch (NumberFormatException e) {
				System.out.println("Enter only Integer!");
			}	
		}
		if(input==roulette) {
			System.out.println("Сongratulations!!! You guessed,it was: " + roulette);
		}
	}
	
}
