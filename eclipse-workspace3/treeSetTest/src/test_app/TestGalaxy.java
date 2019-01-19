package test_app;

import controller.Galaxy;
import item.Planet;

public class TestGalaxy {

	public static void main(String[] args) {
//		Galaxy gal1 = new Galaxy("1NH");
//		Planet pl1 = new Planet("frf",12312,1);
//		gal1.addPlanet(pl1);
		
		Galaxy gal1 = new Galaxy("Galaxy Bananas");
		Planet pl1 = new Planet("Manky",12345,13233356);
		Planet pl2 = new Planet("Banan-11",5235,23293356);
		Planet pl3 = new Planet("Banan-15",17745,14433356);
		Planet pl4 = new Planet("Mumu-1",16345,13238856);
		Planet pl5 = new Planet("Q-2",42345,337863356);
		Planet pl6 = new Planet("Maki-4",22345,432356);
		
		gal1.addPlanet(pl1);
		gal1.addPlanet(pl2);
		gal1.addPlanet(pl3);
		gal1.addPlanet(pl4);
		gal1.addPlanet(pl5);
		gal1.addPlanet(pl6);
		
		gal1.displayGalaxy();
		
		gal1.remove(pl4);
		gal1.displayGalaxy();
	}

}
