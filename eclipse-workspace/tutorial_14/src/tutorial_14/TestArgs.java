package tutorial_14;

public class TestArgs {

	public static void main(String[] args) {
		
		int numberOfArgs = args.length;
		System.out.println(numberOfArgs);
		
		for(int i = 0;i<args.length;i++) {
			System.out.println(args[i]);
		}
		
	}

}
