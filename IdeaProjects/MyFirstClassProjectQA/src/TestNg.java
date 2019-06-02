import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestNg {

    @Test
    public void childTest(){
        WebDriver driver = new ChromeDriver();
       // WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.get("http://mishpahug.co.il/");
        System.out.println(driver.getTitle());
       // driver.manage().window().fullscreen();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());


        driver.quit();
    }
}
