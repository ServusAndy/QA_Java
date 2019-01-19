package app;

import java.util.ArrayList;

import dto.BookShop;
import dto.Item;

public class BookShopApp {

	public static void main(String[] args) {
		Item i1 = new Item("1111","Megre","detective",85.40);
		Item i2 = new Item("1122","Boby","detective",45.);
		Item i3 = new Item("1133","Black","detective",60.15);
		Item i4 = new Item("2211","LOTR","fantasy",120.98);
		Item i5 = new Item("2222","Hobbit","fantasy",112.);
		Item i6 = new Item("3311","Mirrors","horror",72.);
		
		BookShop bs = new BookShop();
		bs.add(i1);
		bs.add(i2);
		bs.add(i3);
		bs.add(i4);
		bs.add(i5);
		bs.add(i6);
	
		ArrayList<Item> deteciveArr = bs.getItemByCategory("detective");
		deteciveArr.forEach(System.out::println);
		ArrayList<Item> fantasyArr = bs.getItemByCategory("fantasy");
		fantasyArr.forEach(System.out::println);
		ArrayList<Item> horrorArr = bs.getItemByCategory("horror");
		horrorArr.forEach(System.out::println);
		
	}

}
