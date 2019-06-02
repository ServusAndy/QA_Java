import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkMish {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        //driver.findElement(By.id("closedIntro")).click();
     //   WebElement closedIntro = driver.findElement(By.id("closedIntro"));
      //  closedIntro.click();
      //  WebElement logButton = driver.findElement(By.id("idsignin"));
      //  logButton.click();
       // Dimension d = new Dimension(600,600);
       // driver.manage().window().setSize(d);
      //  driver.findElement(By.id("logininput")).sendKeys("Andy");
     //   driver.findElement(By.id("passwordinput")).sendKeys("semen2005");
      //  driver.findElement(By.id("signinrequest")).click();
        //driver.quit();

        driver.get("http://www.newru.co.il/");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());

        //driver.quit();

    }
}
