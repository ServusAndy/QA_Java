package items;

import Inter.IBarkable;
import Inter.IChirikable;

public class Tuki extends Animals implements IChirikable, IBarkable{
 private String name;
 private int age;
 private String color;
public Tuki(String kind, String subspacies, String name, int age, String color) {
	super(kind, subspacies);
	this.name = name;
	this.age = age;
	this.color = color;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Tuki: " + super.toString() + " name: " + name + " age: " + age + " color: " + color;
}
@Override
public void chirik() {
	System.out.println("chirik!chirik!");
	
}
@Override
public void bark() {
	System.out.println("gav!chirik!");
	
}
 
 
 
}
