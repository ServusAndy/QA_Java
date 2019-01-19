
public class Main {

	public static void main(String[] args) {
		
		System.out.println(addAll(1,3));
		System.out.println(addAll(1,3,2,5));
	}
	   public static int addAll(int ... numbers)
	    {
	        int sum = 0;
	 
	        for (int i = 0; i < numbers.length ; i++)
	        {
	            sum = sum + numbers[i];
	            System.out.println("Adding " + numbers[i] + ": get " + sum);
	        }
	        return sum;
	    }

}
