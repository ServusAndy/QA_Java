package dto;

import java.util.ArrayList;

import interfaces.IShop;

public class BookShop implements IShop<Item> {
	public ArrayList<Item> detective = new ArrayList<>();
	private ArrayList<Item> fantasy= new ArrayList<>();
	private ArrayList<Item> horror= new ArrayList<>();
	private int count = 0;

	@Override
	public boolean add(Item item) {
		if (item == null)
			return false;
		if (item.getCategory().equals("detective")) {
			detective.add(item);
			return true;
		}
		if (item.getCategory().equals("fantasy")) {
			fantasy.add(item);
			return true;
		}
		if (item.getCategory().equals("horror")) {
			horror.add(item);
			return true;
		}else
		return false;
	}

	@Override
	public ArrayList<Item> getItemByCategory(String category) {
		if(category.equals("detective")) {
			return detective;
		}
		if(category.equals("fantasy")) {
			return fantasy;
		}
		if(category.equals("horror")) {
			return horror;
		}else
		return null;
	}

	@Override
	public ArrayList<Item> getItemByPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getItemCount(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Item buy(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Item> buy(String id, int count) {
		if(id.substring(0, 2).equals("11") && count>0 && count<detective.size()){
			return detective;
		}
		if(id.substring(0, 2).equals("22") && count>0 && count<fantasy.size()){
			return fantasy;
		}
		if(id.substring(0, 2).equals("33") && count>0 && count<horror.size()){
			return horror;
		}else
		return null;
	}

	@Override
	public void returnItem(Item item) {
		// TODO Auto-generated method stub

	}

	@Override
	public void returnItem(Item item, int count) {
		// TODO Auto-generated method stub

	}

}
