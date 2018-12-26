package tutorial_11;

public class TestBook {

	public static void main(String[] args) {
	
		LibraryBook lb = new LibraryBook("Djony Don",345,"black gold","34567");
		Magazine m = new Magazine("Baby boy",234,"big ban","netsil");
		HomeBook hb = new HomeBook("Salvatore",333,"Orks back","unkle");
		
		Book[] arr = new Book[10];
		arr[0] = lb;
		Display(arr);

	}
	
	public static void Display(Book[] arr) {
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] != null) {
			System.out.println(arr[i]);
		}else {
			break;
		}
	} 
	}
}
