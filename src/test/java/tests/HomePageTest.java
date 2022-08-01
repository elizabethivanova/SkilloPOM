package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{
 final static String URL="http://training.skillo-bg.com/posts/all";

 @Test
 public void checkHeaderLinksAfterLogin(){
     driver.get("http://training.skillo-bg.com/users/login");
     loginPage.login("elizabethtest", "password");
     Assert.assertTrue(homePage.isHomeLinkDisplayed());
     Assert.assertTrue(homePage.isProfileLinkDisplayed());
     Assert.assertTrue(homePage.isNewPostLinkDisplayed());
     Assert.assertTrue(homePage.isSearchBarDisplayed());
 }
}
