package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(css = "#defaultLoginFormUsername")
    WebElement usernameFiled;
    @FindBy(css = "#defaultLoginFormPassword")
    WebElement passwordField;
    @FindBy(css = "#sign-in-button")
    WebElement signInBtn;
    @FindBy(css = "#nav-link-login")
    WebElement loginLinkInHeader;

    @FindBy(css=".toast-error")
    WebElement invalidCredErrorMSG;
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    public void setUsername(String username){
        usernameFiled.sendKeys(username);
    }
    public void setPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickSignInBtn(){
        signInBtn.click();
    }
    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickSignInBtn();
    }
    public void isLoginLinkDisplayed(){
        Assert.assertTrue(loginLinkInHeader.isDisplayed());
    }
    public void isErrorMsgDisplayed(){
        fluentWait.until(ExpectedConditions.visibilityOf(invalidCredErrorMSG));
        Assert.assertTrue(invalidCredErrorMSG.isDisplayed());
        Assert.assertEquals(invalidCredErrorMSG.getText(), "User not found");
    }
}
