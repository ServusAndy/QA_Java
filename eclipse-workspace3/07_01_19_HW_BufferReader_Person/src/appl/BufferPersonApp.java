package appl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

import exception.PersonWrongDataException;
import item.Person;

public class BufferPersonApp {

	private static final String EXIT_STRING = "quit";
	private static String CLEAR_STRING = "clear";

	public static void main(String[] args) throws PersonWrongDataException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashSet<Person> hsp = new HashSet<>();;
		
		while(true) {
			
            String line = null;
			
			String firstName = null;
			String lastName = null;
			int year = 0;
			double weight = 0.;
			boolean married = false;
			
			boolean quitFlag = false;
			boolean clearFlag = false;
			while(true) {
				System.out.println("Input Person date:\n\n" + "\tfirstName\t : 'some name'\n" + "\tlastName\t : 'some family Name'\n"
						+ "\tyear\t : '1-120'\n" + "\tweight\t : '10. - 135.'\n" +  "\tmarried\t : 'true or false'\n"+"\n\t'" + EXIT_STRING
						+ "' to quit" + "\n\t'" + CLEAR_STRING  + "' to begin again" + "\n\n\t" + "now press Enter to begin!");
				line = br.readLine();
				if (line.equalsIgnoreCase(EXIT_STRING)) {
					quitFlag = true;
					break;
				}
				while(true) {
					System.out.println("\nInput firstName (must be String)\n");
					line = br.readLine();
					if (line.equalsIgnoreCase(EXIT_STRING)) {
						quitFlag = true;
						break;
					}
					if (line.equalsIgnoreCase(CLEAR_STRING)) {
						clearFlag = true;
						break;
					}
					firstName = line;
					break;
				}
				if (quitFlag)
					break;
				if (clearFlag)
					continue;
				while(true) {
					System.out.println("\nInput lastName (must be String)\n");
					line = br.readLine();
					if (line.equalsIgnoreCase(EXIT_STRING)) {
						quitFlag = true;
						break;
					}
					if (line.equalsIgnoreCase(CLEAR_STRING)) {
						clearFlag = true;
						break;
					}
					lastName = line;
					break;
				}
				if (quitFlag)
					break;
				if (clearFlag)
					continue;
				while(true) {
					System.out.println("\nInput year (must be int)\n");
					line = br.readLine();
					if (line.equalsIgnoreCase(EXIT_STRING)) {
						quitFlag = true;
						break;
					}
					if (line.equalsIgnoreCase(CLEAR_STRING)) {
						clearFlag = true;
						break;
					}
					year = Integer.parseInt(line);
					break;
				}
				if (quitFlag)
					break;
				if (clearFlag)
					continue;
				while(true) {
					System.out.println("\nInput weight (must be double)\n");
					line = br.readLine();
					if (line.equalsIgnoreCase(EXIT_STRING)) {
						quitFlag = true;
						break;
					}
					if (line.equalsIgnoreCase(CLEAR_STRING)) {
						clearFlag = true;
						break;
					}
					weight = Double.parseDouble(line);
					break;
				}
				if (quitFlag)
					break;
				if (clearFlag)
					continue;
				while(true) {
					System.out.println("\nInput married (must be true or false)\n");
					line = br.readLine();
					if (line.equalsIgnoreCase(EXIT_STRING)) {
						quitFlag = true;
						break;
					}
					if (line.equalsIgnoreCase(CLEAR_STRING)) {
						clearFlag = true;
						break;
					}
					married = Boolean.parseBoolean(line);
					break;
				}
				if (quitFlag)
					break;
				if (clearFlag)
					continue;
				hsp.add(new Person(firstName,lastName,year,weight,married));
			}
		if(quitFlag)break;
		
		}
		
		hsp.forEach(System.out::println);
		
	}

}
