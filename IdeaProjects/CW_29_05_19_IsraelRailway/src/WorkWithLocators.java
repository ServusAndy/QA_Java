import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WorkWithLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        /*driver.get("https://www.rail.co.il/en");
        Thread.sleep(4000);
        System.out.println(driver.findElement(By.xpath("//button[@type='button']" +
                "[@class='ng-binding'][@ng-click='getAllData()']")).getText());
        WebElement fromField = driver
                .findElements(By.xpath("//input[@role='combobox']")).get(0);
        WebElement toField = driver
                .findElements(By.xpath("//input[@role='combobox']")).get(1);
        System.out.println("from where: " + fromField.getAttribute("placeholder"));
        System.out.println("to where: " + toField.getAttribute("placeholder"));
        WebElement fromFieldCSS = driver
                .findElements(By.cssSelector("input[role='combobox']")).get(0);
        WebElement toFieldCSS = driver
                .findElements(By.cssSelector("input[role='combobox']")).get(1);
        System.out.println("from where: " + fromFieldCSS.getAttribute("placeholder"));
        System.out.println("to where: " + toFieldCSS.getAttribute("placeholder"));

        System.out.println("Return control: " + driver.findElement(By
                .cssSelector("label[for='twoWay']")).getText());
        System.out.println("Return control: " + driver.findElement(By
                .xpath("//label[@class='ng-binding']")).getText());
        //label[@class='ng-binding']
        //label.ng-binding

        driver.quit();
        //a[@class='dropdown-toggle noindex lang']
        //ul[@role='presentation']

         */
        driver.get("https://cv-app-test.herokuapp.com/");
        Thread.sleep(4000);
        driver.findElements(By.xpath("//button[contains(text(),'Register')]")).get(1).click();
        System.out.println("first name: " + driver.findElement(By
                .cssSelector("#firstName")).getAttribute("placeholder"));
        System.out.println("email: " + driver.findElement(By
                .xpath("//div[@class='form-group row']/input[@placeholder='email*']")).getAttribute("id"));
        System.out.println("conf pass: " + driver.findElement(By
                .xpath("//div[@class='form-group row']/input[@placeholder='confirm password']")).getAttribute("id"));

        //driver.quit();


    }
}
