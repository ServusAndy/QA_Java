package interfaces;

import java.util.ArrayList;

public interface IShop<T> {
	public boolean add(T item);
	public ArrayList<T> getItemByCategory(String category);
	public ArrayList<T> getItemByPrice();
	public int getItemCount(String id);
	public T buy(String id);
	public ArrayList<T> buy(String id,int count);
	public void returnItem(T item);
	public void returnItem(T item,int count);
}
