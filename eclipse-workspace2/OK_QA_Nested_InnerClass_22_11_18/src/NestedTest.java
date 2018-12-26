
public class NestedTest {

	public static void main(String[] args) {
		
		
		//First.Second test1 = new First.Second();	
		//System.out.println(test1.y);
		First f = new First();
		First.Second test2 = f.new Second();
	//	System.out.println(test2.y);
		
		test2.method(333);
	}

}
