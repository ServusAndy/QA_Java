package controller;

import java.util.TreeSet;

import item.Planet;

public class Galaxy {
	private String name;
	private TreeSet<Planet> planets = null;
	
	public Galaxy(String name) {
		this.name = name;
		planets = new TreeSet<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name==null||name=="") {
			System.out.println("WTF");
			return;
		}
		this.name = name;
	}
	
	public void addPlanet(Planet p) {
		if(p==null) {
			System.out.println("WTF planet null?");
			return;
		}
		planets.add(p);
	}
	
	public void remove(Planet p) {
		if(p==null) {
			System.out.println("WTF planet null?");
			return;
		}
		planets.remove(p);
	}
	
	public void displayGalaxy() {
		System.out.println("Name: " + name);
		System.out.println("Total planets : " + planets.size());
		System.out.println("**************************************************");
		System.out.println("No.    \t|Name      |Size     |Time to Earth     ");
		System.out.println("**************************************************");
		int count=1;
		for(Planet planet:planets) {
			System.out.print(count+"\t");
			System.out.println(planet);
			count++;
		}
		System.out.println("************************************************");
	}
}
