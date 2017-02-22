package wordpreses.testcase;

import Helper.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import wordpress.pages.LoginPageNew;

/**
 * Created by riponctg on 2/21/2017.
 */
public class VerifyValidLogin {
    @Test
    public void checkValidUser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\riponctg\\neon\\workspace\\SeleniumProject1\\driver\\chromedriver.exe");
        //This will launch broswer and specific url
       WebDriver driver = BrowserFactory.startBrowser("chrome", "https://wordpress.com/wp-login.php");

       // Created page object using Page Factory
        LoginPageNew login_page = PageFactory.initElements(driver, LoginPageNew.class);

        //LoginPage loging_page_old= PageFactory.initElements(driver, LoginPage.class);
        //call the method
        login_page.login_wordpress("ripon792", "$Ctg1025");
    }
}
