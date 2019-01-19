import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args){
		try {
		//	printer(null);
			printer("String");
			countNumber("st");
			
		}catch(FileNotFoundException ex) {
			System.out.println("FileNotFoundException");
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Main end");
	}
	
	public static void printer(Object obj) throws Exception {
		if(obj==null) {
			throw new Exception();
		}
		System.out.println(obj);
	}
	
	public static int countNumber(String str) throws FileNotFoundException {
		if(str.length()<3) {
			throw new FileNotFoundException();
		}
		char[] arr = str.toCharArray();
		int count = 0;
		for(char c:arr) {
			if(Character.isDigit(c)) {
				count++;
			}
		}
		return count;
	}
}
