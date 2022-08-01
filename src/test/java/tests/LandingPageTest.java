package tests;

import org.testng.Assert;
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
        Assert.assertTrue(landingPage.checkHomeButton());
    }

    @Test
    public void checkPosts(){
        Assert.assertEquals(landingPage.checkPosts(), 3);
    }

    @Test
    public void checkHeaderLinksBeforeLogin(){
        Assert.assertTrue(landingPage.checkHomeButton());
        Assert.assertTrue(landingPage.checkLoginLink());
    }
}
