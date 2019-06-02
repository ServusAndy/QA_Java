import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class IOTest {

    public static void main(String[] args) throws IOException {
        List<Person> list = new ArrayList<>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);


        EXIT:
        while(true) {
            System.out.println("Type command: ");
            String input = br.readLine();
            String[] arr = input.trim().split(" ");
            if(arr.length==0) {
                System.out.println("Wrong comand!");
                continue;
            }
            switch(arr[0].toLowerCase()) {
                case "add":
                    list.add(Person.InputPerson());
                    System.out.println("person is created");
                    break;
                case "rm":

                    break;
                case "show":
                    System.out.println("----------------");
                    list.forEach(System.out::println);
                    break;
                case "exit":
                    break EXIT;
                default:
                    System.out.println("Wrong command!");
            }

        }

        System.out.println("Bye Bye!");

    }

    private static class Person{
        private String name;
        private int age;

        public Person(){};

        public Person(String name,int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public static String getStringFromConsole() throws IOException {
            return new BufferedReader(new InputStreamReader(System.in)).readLine();
        }

        public static int getIntFromConsole() throws IOException {
            return Integer.parseInt(getStringFromConsole().trim());
        }

        public static Person InputPerson() throws IOException{
            Person person = new Person();
            while (true) {
                System.out.println("Input Person date:\n\n"
                        + "\tName\t : 'some name'\n"
                        + "\tage\t : '1-120'\n" + "\n\t");
                System.out.println("input First Name");
                person.setName(getStringFromConsole().trim());
                break;
            }
            while (true) {
                System.out.println("input year");
                person.setAge(getIntFromConsole());
                break;
            }
            return person;
        }
    }

}