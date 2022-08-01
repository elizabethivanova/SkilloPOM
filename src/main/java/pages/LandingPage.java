package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LandingPage extends BasePage{

    @FindBy(css = "#nav-link-home")
    private WebElement homeButtonOnHeader;
    @FindBy(css = "#nav-link-login")
    private WebElement loginLinkInHeader;
    @FindBy(xpath = "//*[@class='col-12 offset-md-1 col-md-10 offset-lg-3 col-lg-6']")
    private List<WebElement> elementsOnLandingPage;

    public LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public boolean checkHomeButton(){
        return homeButtonOnHeader.isDisplayed();
    }
    public int checkPosts(){
        return elementsOnLandingPage.size();
    }
    public boolean checkLoginLink(){
        return loginLinkInHeader.isDisplayed();
    }
}
