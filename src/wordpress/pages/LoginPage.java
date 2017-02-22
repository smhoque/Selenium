package wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by riponctg on 2/20/2017.
 * This class will store all
 */
public class LoginPage {
     WebDriver driver;
     By username = By.id("user_login");
     By password = By.xpath("html/body/div[1]/form/p[2]/label/input");
     By loginButton = By.name("wp-submit");

     public void loginToWordPress(String uid, String pass){
          driver.findElement(username).sendKeys(uid);
          driver.findElement(password).sendKeys(pass);

     }
     public LoginPage(WebDriver driver){
          this.driver=driver;
     }
     public void typeUserName(String uid){
          driver.findElement(username).sendKeys(uid);
     }
     public  void typePassword(String pass){
          driver.findElement(password).sendKeys(pass);
     }
     public void clickLoginButton(){
          driver.findElement(loginButton).click();

     }
}
