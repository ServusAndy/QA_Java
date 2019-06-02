import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginNegativTestNG {
    WebDriver driver = new FirefoxDriver();
    WebElement loginField;
    WebElement passwordField;
    WebElement signInButton;
    String mainUrl = "https://mishpahug.co.il/";
    String actual;
    String expected;

    @BeforeClass
    public void openMainUrl() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(mainUrl);
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("idsignin")).click();
    }

    @Test
    public void testWrongAuthorizationMessage() throws InterruptedException {
        expected = "Wrong Authorization!\n" +
                "Remind...";
        loginField = driver.findElement(By.id("logininput"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("Andyy");
        passwordField = driver.findElement(By.id("passwordinput"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("sem2007");
        signInButton = driver.findElement(By.id("signinrequest"));
        signInButton.click();
        Thread.sleep(4000);

        WebElement wrongloginorpassword = driver.findElement(By.id("wrongloginorpassword"));
        actual = wrongloginorpassword.getText();
        System.out.println(actual);

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void testNotAllFieldsArefilledMessage() throws InterruptedException {
        expected = "Not all fields are filled!";

        loginField = driver.findElement(By.id("logininput"));
        loginField.click();
        loginField.clear();
        loginField.sendKeys("");
        passwordField = driver.findElement(By.id("passwordinput"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("sem2007");
        signInButton = driver.findElement(By.id("signinrequest"));
        signInButton.click();
        Thread.sleep(4000);

        WebElement emptyloginorpassword = driver.findElement(By.id("emptyloginorpassword"));
        actual = emptyloginorpassword.getText();
        System.out.println(actual);

        Assert.assertEquals(actual,expected);

    }

    @AfterClass
    public void quit(){
        driver.findElement(By.id("closedsignin")).click();
        WebElement login = driver.findElement(By.id("idsignin"));
        System.out.println("You are not logged: " + login.isDisplayed());
        driver.quit();
    }
}
