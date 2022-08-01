package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(css = "#defaultLoginFormUsername")
    private WebElement usernameFiled;
    @FindBy(css = "#defaultLoginFormPassword")
    private WebElement passwordField;
    @FindBy(css = "#sign-in-button")
    private WebElement signInBtn;
    @FindBy(css = "#nav-link-login")
    private WebElement loginLinkInHeader;

    @FindBy(css=".toast-error")
    private WebElement invalidCredErrorMSG;
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
    public boolean isLoginLinkDisplayed(){
        return loginLinkInHeader.isDisplayed();
    }
    public boolean isErrorMsgDisplayed(){
        fluentWait.until(ExpectedConditions.visibilityOf(invalidCredErrorMSG));
        return invalidCredErrorMSG.isDisplayed();
    }
    public String isErrorMessageCorrect(){
        return invalidCredErrorMSG.getText();
    }
}
