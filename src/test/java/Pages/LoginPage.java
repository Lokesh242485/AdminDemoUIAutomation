package Pages;

import Framework.Browser;
import Framework.Util.DriverManager;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class LoginPage extends BasePage{

    private WebElement loginButton = DriverManager.getInstance().Driver.findElement(By.xpath("//div/button"));
    private WebElement pageLabel = DriverManager.getInstance().Driver.findElement(By.xpath("//div/h1[text()='Admin area demo']"));

    public LoginPage(String title){
        super(title);
        Browser.WaitForReady();
    }

    public void clickOnLoginButton(){
        Browser.clickOnElement(loginButton);
    }

    public void verifyPageLabelDisplayedOnLoginPage(){
        Browser.waitForElementToDisplay(pageLabel);
    }

}
