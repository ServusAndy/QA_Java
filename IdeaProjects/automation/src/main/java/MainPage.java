import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver webDriver;
    private WebDriverWait wait;

    @FindBy(xpath = "/html/body/div[2]/form/fieldset/button")
    WebElement searchButton;

    @FindBy(id = "searchInput")
    WebElement searchInputFind;

    public MainPage(WebDriver driver){
        webDriver = driver;
        wait = new WebDriverWait(webDriver,30);

        PageFactory.initElements(webDriver,this);
    }

    public void searchFor(String text) {
        searchInputFind.clear();
        searchInputFind.sendKeys(text);
    }

    public void clickSearchButton(){
        searchButton.click();
    }
}
