
public class First {
	public int x = 10;
	
	/*private*/ public /*static*/ class Second{//NestedClass
		public int y = 20;
		public int x =12;
		public void method(int x) {
			
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(First.this.x);
		}
		
	}
	
	public void method() {
		this.new Second();
	}
}
