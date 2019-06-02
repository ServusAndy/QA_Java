import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UTest {
    WebDriver web;
    MainPage mainPage;

    @Before
    public void setUp(){
     //   System.setProperty("webdriver.chrome.driver","/home/andi/Downloads/chromedriver/chromedriver");
        web = new ChromeDriver();
        web.get("https://www.wikipedia.org/");

        mainPage = new MainPage(web);
        mainPage.searchFor("Automation");
       // mainPage.clickSearchButton();

        // web.findElement(By.id("searchInput")).sendKeys("Automation");
        // web.findElement(By.id("searchInput")).sendKeys(Keys.RETURN);
    }

    @Test
    public void enableButtonElement(){

        Assert.assertTrue(web.findElement(By.xpath("/html/body/div[2]/form/fieldset/button")).isEnabled());
        web.quit();

    }

    @After
    public void tearDown(){
        if(web!=null){
            web.quit();
        }
    }

}
