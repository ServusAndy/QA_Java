import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;


public class ProfileMyFamilyAtributTypes {
    public static WebElement confessionByUserProfile;
    public static  WebElement foodProferenceByUserProfile;
    public static WebElement emailByUserProfile;
    public static WebElement confessionMyFamilyProfile;
    public static WebElement foodProferenceMyFamilyProfile;
    public static WebElement emailMyFamilyProfile;

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


        //Elements by User Profile
        WebElement profileButton = driver.findElement(By.id("profile"));
        profileButton.click();
        Thread.sleep(3000);
        confessionByUserProfile = driver.findElement(By.xpath("//span[@id='fieldobjconfession']"));
        String confessionByUserProfileStr = confessionByUserProfile.getText();
        foodProferenceByUserProfile = driver.findElement(By.id("fieldobjfoodPreferences"));
        String foodProferenceByUserProfileStr = foodProferenceByUserProfile.getText();
        emailByUserProfile = driver.findElement(By.id("fieldobjelMail"));
        String emailByUserProfileStr = emailByUserProfile.getText();
        driver.findElement(By.xpath("//div[@id='userprofileform']//div[@class='but-closed closed-btn']")).click();


        //Elements by MyFamily
        WebElement MyFamilyButton = driver.findElement(By.id("family"));
        MyFamilyButton.click();
        Thread.sleep(3000);
        confessionMyFamilyProfile = driver.findElement(By.xpath("//span[@id='fieldobjconfession']"));
        String confessionMyFamilyProfileStr = confessionMyFamilyProfile.getText();
        foodProferenceMyFamilyProfile = driver.findElement(By.cssSelector("span[id='fieldobjfoodPreferences']"));
        String foodProferenceMyFamilyProfileStr = foodProferenceMyFamilyProfile.getText();
        emailMyFamilyProfile = driver.findElement(By.xpath("//span[@id='fieldobjelMail']"));
        String emailMyFamilyProfileStr = emailMyFamilyProfile.getText();
        driver.findElement(By.xpath("//div[@id='userprofileform']//div[@class='but-closed closed-btn']")).click();


        if(confessionByUserProfileStr.equals(confessionMyFamilyProfileStr)
                && foodProferenceByUserProfileStr.equals(foodProferenceMyFamilyProfileStr)
        ){
            System.out.println("TEST PASSED! \n" + confessionByUserProfileStr + " = " + confessionMyFamilyProfileStr + "\n"
                    + foodProferenceByUserProfileStr + " = " + foodProferenceMyFamilyProfileStr + "\n"
                    + emailByUserProfileStr + " = " + emailMyFamilyProfileStr);
        }else{
            System.out.println("TEST FAILED!");
        }

        driver.quit();

    }
}
