import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class MishTest {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mishpahug.co.il/");
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(5000);
        WebElement logButton = driver.findElement(By.id("idsignin"));
        //logButton.click();
        List<WebElement> listButtons = driver.findElements(By.className("navi-item"));
        System.out.println("quantity of elements by class navi-item: " + listButtons.size());
        System.out.println(listButtons.get(0).getText());
        System.out.println(listButtons.get(1).getText());
        System.out.println(listButtons.get(2).getText());
      //listButtons.get(2).click();
        List<WebElement> listElementTagSpan = driver.findElements(By.tagName("span"));
        System.out.println("size : " + listElementTagSpan.size());
        driver.findElement(By.name("selectholidays")).click();
        System.out.println(driver.findElement(By.linkText("News Mishpahug.")).getAttribute("id"));


        //driver.quit();

    }
}
