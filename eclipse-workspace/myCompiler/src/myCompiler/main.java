package myCompiler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		List<Message> messages = new ArrayList();
		messages.add(new Message("Hello, World!"));
		messages.add(new Message("Hello, Sun!"));
		System.out.println(messages);

		Message ms = messages.get(0);
		Message ms1 = messages.get(1);

		Comparator<Message> comparator = new Comparator<Message>() {

			@Override
			public int compare(Message m, Message m1) {

				return m.getId().compareTo(m1.getId());
			}
		};
		
		System.out.println(comparator.compare(ms, ms1));
	}

}
