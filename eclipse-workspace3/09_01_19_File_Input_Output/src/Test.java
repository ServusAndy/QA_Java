import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import item.Person;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new FileReader("poem.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("persons.dta"));
		
		br = new BufferedReader(new FileReader("/home/andi/eclipse-workspace3/09_01_19_File_Input_Output/src/item/Person.java"));
	//	br = new BufferedReader(new FileReader("/home/andi/Documents/my_books/ISTQB Glossary of terms used in FL2018.pdf"));
		
		
		
		String line = null;
//		while(true) {
//			line = br.readLine();
//			if(line == null)break;
//			System.out.println(line);
//		}
		
		while((line = br.readLine())!=null) {
			//System.out.println(Person.getPerson(line,";"));
			System.out.println(line);
		}
		br.close();
		
		
		
		
		
		//=====================================================================================================
	/*	ArrayList<Person> alp = new ArrayList<>();
		alp.add(new Person("Pasha",34,68.,true));
		alp.add(new Person("Masha",22,52.,false));
		alp.add(new Person("Dasha",29,58.4,true));
		alp.add(new Person("Sasha",38,88.2,false));
		
		File file = new File("writtenPersons.txt");
		if(!file.exists())file.createNewFile();
		
		PrintWriter pw = new PrintWriter(new FileWriter(file,true));
		for(Person p:alp)pw.println(p.toCSV()); //f5 restart Package!!!
		pw.close();
       */
		
		
		

	}

}