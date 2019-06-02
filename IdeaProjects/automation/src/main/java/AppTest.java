import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver.chrome.driver","/home/andi/Downloads/chromedriver/chromedriver");
        WebDriver web = new ChromeDriver();
        web.get("https://www.wikipedia.org/");



        System.out.println(web.getTitle());

        web.findElement(By.id("searchInput")).sendKeys("Automation");
       // web.findElement(By.id("searchInput")).sendKeys(Keys.RETURN);
        web.findElement(By.xpath("/html/body/div[2]/form/fieldset/button")).click();



        web.quit();
    }

}
