package exception;

@SuppressWarnings("serial")
public class PersonWrongDataException extends Exception{
		
	public PersonWrongDataException(String msg) {
		super(msg);
	}
}
