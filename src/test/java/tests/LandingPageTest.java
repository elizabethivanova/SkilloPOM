package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LandingPage;


public class LandingPageTest extends BaseTest{

    final static String URL = "http://training.skillo-bg.com/";
    @BeforeMethod
    public void init(){
        driver.get(URL);
    }
    @Test
    public void checkHomeButton(){
        landingPage.checkHomeButton();
    }

    @Test
    public void checkPosts(){
        landingPage.checkPosts();
    }

    @Test
    public void checkHeaderLinksBeforeLogin(){
        landingPage.checkHomeButton();
        landingPage.checkLoginLink();
    }
}
