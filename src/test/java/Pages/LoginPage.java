package Pages;

import Framework.Browser;
import Framework.Data.DataManager;
import Framework.Util.ConfigurationManager;
import Framework.Util.DriverManager;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class LoginPage extends BasePage{

    private WebElement username = DriverManager.getInstance().Driver.findElement(By.id("Email"));
    private WebElement password = DriverManager.getInstance().Driver.findElement(By.id("Password"));
    private WebElement loginButton = DriverManager.getInstance().Driver.findElement(By.xpath("//div/button"));


    public LoginPage(String title){
        super(title);
        Browser.WaitForReady();
    }

    public void enterUsername(){
    Browser.enterValue(username, ConfigurationManager.getInstance().getProperty("username"));
    }
    public void enterPassword(){
    Browser.enterValue(password,ConfigurationManager.getInstance().getProperty("password"));
    }

    public void clickOnLoginButton(){
        Browser.clickOnElement(loginButton);
    }

}
