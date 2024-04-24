package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WpDarkModePage;

public class WpDarkModeTestRunner extends Setup {
    @BeforeTest
    public void doLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("Admin","admin");
    }
    @Test(priority = 1, description = "Enable dark mode")
    public void enableDarkMode(){
        WpDarkModePage wpDarkModePage = new WpDarkModePage(driver);
        wpDarkModePage.enableDarkMode();
    }
    @Test(priority = 2, description = "Change floating switch")
    public void changeFloatingSwitch(){
        WpDarkModePage wpDarkModePage = new WpDarkModePage(driver);
        wpDarkModePage.changeFloatingSwitch();
    }
    @Test(priority = 3, description = "Change switch settings")
    public void changeSwitchSettings(){
        WpDarkModePage wpDarkModePage= new WpDarkModePage(driver);
        Utils.scroll(driver,0,700);
        wpDarkModePage.changeSwitchSettings();
    }
    @Test(priority = 4, description = "Change switch position")
    public void changeSwitchPosition(){
        WpDarkModePage wpDarkModePage = new WpDarkModePage(driver);
        Utils.scroll(driver,0,700);
        wpDarkModePage.changeSwitchPosition();
    }
    @Test(priority = 5, description = "Disable keyboard shortcut")
    public void disableKeyboardShortcut(){
        WpDarkModePage wpDarkModePage = new WpDarkModePage(driver);
        wpDarkModePage.disableKeyboardShortcut();
        //save

    }
    @Test(priority = 6, description = "Dark mode view")
    public void darkModeView(){
        WpDarkModePage wpDarkModePage = new WpDarkModePage(driver);
        wpDarkModePage.darkModeView();

        String textActual = driver.findElements(By.cssSelector("[class=\'wp-dark-mode-ignore\']")).get(84).getText();
        String textExpected = "Light";

        Assert.assertEquals(textActual,textExpected);
    }

}
