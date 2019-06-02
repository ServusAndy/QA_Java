import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NotAllFieldsArefilledMessageTest {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://mishpahug.co.il/");
        driver.findElement(By.id("closedIntro")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("idsignin")).click();
        WebElement loginInput = driver.findElement(By.id("logininput"));
        loginInput.sendKeys("");
        WebElement passInput = driver.findElement(By.id("passwordinput"));
        passInput.sendKeys("sem2007");
        WebElement signInButton = driver.findElement(By.id("signinrequest"));
        signInButton.click();
        Thread.sleep(4000);
        WebElement emptyloginorpassword = driver.findElement(By.id("emptyloginorpassword"));
        String expected = "Not all fields are filled!";

        if(emptyloginorpassword.getText().equals(expected)){
            System.out.println(emptyloginorpassword.getText());
        }else{
            System.out.println("Your test FAIL!!!");
        }

        driver.findElement(By.id("closedsignin")).click();
        WebElement login = driver.findElement(By.id("idsignin"));

        if(login.isDisplayed()==true){
            System.out.println("You are not logged: " + login.isDisplayed() + "\n" +
                    "Main page contain: " + login.getText());
        }else{
            System.out.println("you are FAIL!!!");
        }

        driver.quit();
    }
}
