package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class LandingPage extends BasePage{

    @FindBy(css = "#nav-link-home")
    WebElement homeButtonOnHeader;
    @FindBy(css = "#nav-link-login")
    WebElement loginLinkInHeader;
    @FindBy(xpath = "//*[@class='col-12 offset-md-1 col-md-10 offset-lg-3 col-lg-6']")
    List<WebElement> elementsOnLandingPage;

    public LandingPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void checkHomeButton(){
        Assert.assertTrue(homeButtonOnHeader.isDisplayed());
    }
    public void checkPosts(){
        Assert.assertEquals(elementsOnLandingPage.size(), 3);
    }
    public void checkLoginLink(){
        Assert.assertTrue(loginLinkInHeader.isDisplayed());
    }
}
