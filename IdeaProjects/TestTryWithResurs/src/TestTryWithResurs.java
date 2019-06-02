import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class TestTryWithResurs{
    public static void main(String... args) throws IOException {
        
      /*  FileInputStream fis = new FileInputStream("text.txt");
        FileOutputStream fos = new FileOutputStream("mytest.txt");
            fis.transferTo(fos);
            fis.close();
            fos.close();


            try(FileInputStream in = new FileInputStream("test.txt");
            FileOutputStream out = new FileOutputStream("outtext.txt"))
            {
            in.transferTo(out);
            }
*/

      //   new Person("Petya", 45);

      //  Consumer consumer = (v) -> System.out.println(v);

       BufferedReader br =  Files.newBufferedReader(Path.of("test.txt"));
        String line;
       ArrayList<String> strings = new ArrayList<>() ;
        while((line = br.readLine())!=null){
            strings.add(line);
        }
        br.close();
        strings.forEach(System.out::println);
    }
}
