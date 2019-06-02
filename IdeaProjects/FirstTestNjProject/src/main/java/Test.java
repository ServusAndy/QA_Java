import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
       // System.setProperty("webdriver.chrome.driver","/home/andi/Downloads/chromedriver/chromedriver");

        driver.get("http://www.google.com");

        driver.get("https://mishpahug.co.il/");
        driver.close();
    }
}
