package hw_9_11_18;

public class Cat {

	private static boolean wellFed;

	public Cat(boolean wellFed) {
		this.wellFed = wellFed;
	}

	public boolean isWellFed() {
		return wellFed;
	}

	public void setWellFed(boolean wellFed) {
		this.wellFed = wellFed;
	}

	@Override
	public String toString() {
		return "Cat is well fed: " + wellFed;
	}
	
	 public	boolean wellFedCats(boolean wellFed) {
		 if(wellFed!=true)return false;
		return true;
	 }
}
