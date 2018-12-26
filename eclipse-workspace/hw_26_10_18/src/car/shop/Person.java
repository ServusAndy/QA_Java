package car.shop;

public class Person {
    private String FirstName;
    private String LastName;
    
    public Person (String FirstName,String LastName) { 
    	this.FirstName = FirstName;
    	this.LastName = LastName;
    	
    }
    
    
   @Override
    public String toString() {
    	
    	return "FristName: " + FirstName + " LastName: " + LastName;
    }
}
