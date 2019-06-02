import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mishpahug.co.il/");
        driver.findElement(By.id("closedIntro")).click();
        driver.findElement(By.id("idsignin")).click();
        WebElement loginInput = driver.findElement(By.id("logininput"));
        loginInput.sendKeys("Andy");
        WebElement passInput = driver.findElement(By.id("passwordinput"));
        passInput.sendKeys("semen2005");
        WebElement signInButton = driver.findElement(By.id("signinrequest"));
        signInButton.click();
        Thread.sleep(5000);
        WebElement profileButton = driver.findElement(By.id("profile"));
        profileButton.click();
        Thread.sleep(3000);
        WebElement titleProfile = driver.findElement(By.id("titleprofile"));
        System.out.println("Title profile verification: " + titleProfile.getText().contains("Andy"));
        WebElement maritalStatusValue = driver.findElement(By.xpath("//span[@id='fieldobjmaritalStatus']"));
        System.out.println("Marital status: " + maritalStatusValue.getText());


        driver.quit();

    }
}
