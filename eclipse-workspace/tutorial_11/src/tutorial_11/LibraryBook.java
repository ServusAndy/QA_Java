package tutorial_11;

public class LibraryBook extends Book{
	private String serialNumber;
	
	
	public LibraryBook(String author, int pages, String title,String serialNumber) {
		super(author, pages, title);
		this.serialNumber = serialNumber;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	@Override
	public String toString() {
		return super.toString() + " serialNumber: " + serialNumber;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof LibraryBook)) {
			return false;
		}
		LibraryBook other = (LibraryBook) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null) {
				return false;
			}
		} else if (!serialNumber.equals(other.serialNumber)) {
			return false;
		}
		return true;
	}
	
	
	
}
