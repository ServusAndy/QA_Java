package tutorial_11;

public class HomeBook extends Book{
	private String owner;
	
	public HomeBook(String author, int pages, String title,String owner) {
		super(author, pages, title);
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof HomeBook)) {
			return false;
		}
		HomeBook other = (HomeBook) obj;
		if (owner == null) {
			if (other.owner != null) {
				return false;
			}
		} else if (!owner.equals(other.owner)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + " Owner: " + owner;
	}
	
	

}
