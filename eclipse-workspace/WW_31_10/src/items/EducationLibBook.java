 package items;

public class EducationLibBook extends LibBook{

	private String subject;

	public EducationLibBook(String author, String title, int page, int catNumber, String subject) {
		super(author, title, page, catNumber);
		this.subject = subject;
	}

	public EducationLibBook() {
		super();
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return super.toString() + " EducationLibBook: " + subject;
	}
	
	
}

