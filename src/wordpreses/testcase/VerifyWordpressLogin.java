package wordpreses.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import wordpress.pages.LoginPage;

/**
 * Created by riponctg on 2/20/2017.
 */
public class VerifyWordpressLogin {

    @Test
    public void verifyValidlogin(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\riponctg\\neon\\workspace\\SeleniumProject1\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://wordpress.com/wp-login.php");

        LoginPage login = new LoginPage(driver);
        login.loginToWordPress("ripon792", "$Ctg1025");
//        login.typeUserName("ripon792");
//        login.typePassword("$Ctg1025");
        login.clickLoginButton();

        driver.quit();
    }
}
