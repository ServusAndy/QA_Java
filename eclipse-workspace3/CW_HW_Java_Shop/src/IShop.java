import java.util.ArrayList;

public interface IShop {
	 boolean add(Item item);
	 Iterable<Item> getItemByCategory(String category);
	 Iterable<Item> getItemByPrice();
	 int getItemCount(String id);
	 Item buy(String id);
	 Iterable<Item> buy(String id,int count);
	 void returnItem(Item item);
	 void returnItem(Item item,int count);
}
