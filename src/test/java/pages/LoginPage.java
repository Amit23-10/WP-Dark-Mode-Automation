package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "log")
    WebElement txtusername ;

    @FindBy(name = "pwd")
    WebElement txtpassword;

    @FindBy(name = "wp-submit")
    WebElement login ;

    @FindBy(css = "[class=\'wp-menu-name wp-dark-mode-ignore\']")
    List<WebElement> pluginButton ;


    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void doLogin(String username, String password){
        txtusername.sendKeys(username);
        txtpassword.sendKeys(password);
        login.click();
        pluginButton.get(7).click();
    }
}
