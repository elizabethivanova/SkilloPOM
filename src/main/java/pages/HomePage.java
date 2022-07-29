package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage{

    @FindBy(css = "#nav-link-profile")
    WebElement profileLinkInHeader;
    @FindBy(css = ".fas.fa-sign-out-alt.fa-lg")
    WebElement logoutBtn;
    @FindBy(css = "#nav-link-new-post")
    WebElement newPostLinkInHeader;
    @FindBy(css = "#nav-link-home")
    WebElement homeLinkInHeader;
    @FindBy(css = "#search-bar")
    WebElement searchBarInHeader;
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void isProfileLinkDisplayed(){
        Assert.assertTrue(profileLinkInHeader.isDisplayed());
    }
    public void logout(){
        logoutBtn.click();
    }
    public void isNewPostLinkDisplayed(){
        Assert.assertTrue(newPostLinkInHeader.isDisplayed());
    }
    public void isHomeLinkDisplayed(){
        Assert.assertTrue(homeLinkInHeader.isDisplayed());
    }
    public void isSearchBarDisplayed(){
        Assert.assertTrue(searchBarInHeader.isDisplayed());
    }
}
