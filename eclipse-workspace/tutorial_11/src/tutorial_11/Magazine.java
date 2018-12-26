package tutorial_11;

public class Magazine extends Book{
	private String publischer;
	
	
	public Magazine(String author, int pages, String title,String publischer) {
		super(author, pages, title);
		this.publischer = publischer;
	}


	public String getPublischer() {
		return publischer;
	}


	public void setPublischer(String publischer) {
		this.publischer = publischer;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof Magazine)) {
			return false;
		}
		Magazine other = (Magazine) obj;
		if (publischer == null) {
			if (other.publischer != null) {
				return false;
			}
		} else if (!publischer.equals(other.publischer)) {
			return false;
		}
		return true;
	}


	@Override
	public String toString() {
		return super.toString() + " Publischer: " + publischer;
	}

		
}
