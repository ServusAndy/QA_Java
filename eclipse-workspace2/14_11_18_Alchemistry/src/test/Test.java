package test;

import dto.Gold;
import dto.Shit;
import dto.Substance;

public class Test {

	public static void main(String[] args) {
		
		Gold gold = new Gold(19.3,0.88);
		
		Shit scheise = new Shit(0.9,"yellow");
		
		Substance s =scheise;
		gold = (Gold)s;
	}

}
