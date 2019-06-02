import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUserRoleButtonGuestFamily {
    public static boolean buttonAddEventDisplayed;

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
        Thread.sleep(4000);

        //================================= Guest And Family ===============================================
        driver.findElement(By.id("profile")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#idbtneditprofile")).click();
        driver.findElement(By.xpath("//label[@id='typeuser3inprofile']")).click();
        driver.findElement(By.cssSelector("#idbtnsaveprofile")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='userprofileform']//div[@class='but-closed closed-btn']")).click();

        buttonAddEventDisplayed = driver.findElement(By.xpath("//*[@id='idbtnaddevent']")).isDisplayed();

        if(buttonAddEventDisplayed==true){
            System.out.println("TEST PASSED: After selecting Guest and Family mode the button of 'add event' is displayed");
        }else{
            System.out.println("TEST FAILED: you're fired!!!");
        }

        Thread.sleep(4000);

        //============================ Guest =============================================================
        driver.findElement(By.id("profile")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#idbtneditprofile")).click();
        driver.findElement(By.xpath("//label[@id='typeuser1inprofile']")).click();
        driver.findElement(By.cssSelector("#idbtnsaveprofile")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a//i[@class='fa fa-times-circle-o']")).click();

        buttonAddEventDisplayed = driver.findElement(By.xpath("//*[@id='idbtnaddevent']")).isDisplayed(); //div[@id='idbtnaddevent']

        if(buttonAddEventDisplayed==false){
            System.out.println("TEST PASSED: After selecting Guest mode the button of 'add event' is not displayed");
        }else{
            System.out.println("TEST FAILED: you're fired!!!");
        }

        Thread.sleep(4000);

        //=========================================== Family ===============================================
        driver.findElement(By.id("profile")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#idbtneditprofile")).click();
        driver.findElement(By.xpath("//label[@id='typeuser2inprofile']")).click();
        driver.findElement(By.cssSelector("#idbtnsaveprofile")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a//i[@class='fa fa-times-circle-o']")).click();

        buttonAddEventDisplayed = driver.findElement(By.xpath("//*[@id='idbtnaddevent']")).isDisplayed();

        if(buttonAddEventDisplayed==true){
            System.out.println("TEST PASSED: After selecting Family mode the button of 'add event' is displayed");
        }else{
            System.out.println("TEST FAILED: you're fired!!!");
        }

        driver.quit();

    }
}
