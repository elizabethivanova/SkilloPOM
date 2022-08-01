package tests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest{
    final static String URL="http://training.skillo-bg.com/users/login";
    final static String USERNAME="elizabethtest";
    final static String PASSWORD="password";
    @BeforeMethod
    public void init(){
        driver.get(URL);
    }
    @Test
    public void loginTest(){
        loginPage.login(USERNAME, PASSWORD);
        Assert.assertTrue(homePage.isProfileLinkDisplayed());
    }
    @Test
    public void logout(){
        loginPage.login(USERNAME, PASSWORD);
        homePage.logout();
        Assert.assertTrue(loginPage.isLoginLinkDisplayed());
    }
    @Test
    public void loginWithInvalidCredentials(){
        loginPage.setUsername("fefefwfwdew");
        loginPage.setPassword("pass");
        loginPage.clickSignInBtn();
        Assert.assertTrue(loginPage.isErrorMsgDisplayed());
        Assert.assertEquals(loginPage.isErrorMessageCorrect(), "User not found");
    }
}
