import java.util.HashMap;

public class Shop implements IShop{
	private HashMap<Item,Integer> itemCountMap;
	
	
	@Override
	public boolean add(Item item) {
		
		return false;
	}

	@Override
	public Iterable<Item> getItemByCategory(String category) {
		
		return null;
	}

	@Override
	public Iterable<Item> getItemByPrice() {
	
		return null;
	}

	@Override
	public int getItemCount(String id) {
	
		return itemCountMap.get(new Item());
	}

	@Override
	public Item buy(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Item> buy(String id, int count) {
		// TODO Auto-generated method stub
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
