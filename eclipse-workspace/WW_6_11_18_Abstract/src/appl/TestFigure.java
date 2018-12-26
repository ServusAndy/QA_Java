package appl;

import items.*;
//import items.Square;

public class TestFigure {

	public static void main(String[] args) {
		
		Square s1 = new Square(1.,2.2,2.);
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getArea());
		
		System.out.println("==============");
		
		Circle c1 = new Circle(6.,8.,3.);
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getArea());
		
		Figure[] figs = {s1,c1};
		for(int i = 0; i < figs.length;i++) {
			System.out.println(figs[i].getArea());
		}

	}

}
