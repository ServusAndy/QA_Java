
public class First {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;
//		
//		int res = a/b;
//		
//		System.out.println(res);
//		System.out.println("End programm");
		
		int[] ar = new int[2];
//		try {
//		ar[2]=15;
//		}
//		catch(Exception ex){
//			System.out.println(ex.toString());
//			System.out.println(ex.getMessage());
//			System.out.println("wo wow stop");//tut mojno lubuj logiku napisat
//		}finally{
//			System.out.println("im finaly");
//		}
//		System.out.println("End programm");
		
		try {
		int res = a/b;
		ar[2]=15;
		}
		catch(ArithmeticException ex) 
		{
			System.out.println("Devide by zero");
		}catch(IndexOutOfBoundsException ex) 
		{
			System.out.println("Index Out");
		}
		System.out.println("End programm");
	}

}
