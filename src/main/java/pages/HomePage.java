package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends BasePage{

    @FindBy(css = "#nav-link-profile")
    private WebElement profileLinkInHeader;
    @FindBy(css = ".fas.fa-sign-out-alt.fa-lg")
    private WebElement logoutBtn;
    @FindBy(css = "#nav-link-new-post")
    private WebElement newPostLinkInHeader;
    @FindBy(css = "#nav-link-home")
    private WebElement homeLinkInHeader;
    @FindBy(css = "#search-bar")
    private WebElement searchBarInHeader;
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public boolean isProfileLinkDisplayed(){
        return profileLinkInHeader.isDisplayed();
    }
    public void logout(){
        logoutBtn.click();
    }
    public boolean isNewPostLinkDisplayed(){
        return newPostLinkInHeader.isDisplayed();
    }
    public boolean isHomeLinkDisplayed(){
        return homeLinkInHeader.isDisplayed();
    }
    public boolean isSearchBarDisplayed(){
        return searchBarInHeader.isDisplayed();
    }
}
