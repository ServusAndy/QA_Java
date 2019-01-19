import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class TestPhoneBook {

	public static void main(String[] args) {
		
		//Function<String, Predicate<Contact> > withName = name->contact->contact.getName().equals(name);
		
		PhoneBook pb = new PhoneBook();
		Contact con = new Contact("Alex", "Borsh",26,"JIJA@MAIL.RU","Amsterdam","0534657894");
		pb.addContact(con);
		
		Iterable<Contact> itr = pb.find(whithName("Alex"));
		itr = pb.find(olderThen(24));
		itr = pb.find(whithName("Alex").and(olderThen(24)));
		itr = pb.find(whithName("Alex").negate().and(olderThen(34)));// vse NE Alex starsche 34;
		
		List<String> list = new ArrayList<>();
		pb.find(whithName("Alex"),contact->contact.getCity(),list); //OR :	fb.find(whithName("Alex"),Contact::getCity,list);
		list.forEach(System.out::println);
		
	
		

	}
	
	public static Predicate<Contact> whithName(String name){
		return contact-> Objects.equals(name, contact.getName());
	}
	
	public static Predicate<Contact> olderThen(int age){
		return contact-> contact.getAge()>=age;
	}
}
