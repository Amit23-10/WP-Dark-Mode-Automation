package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends Setup {
    @Test(priority = 1)
    public void doLogin(){
        LoginPage loginPage = new LoginPage(driver);
        String adminUser = System.getProperty("username");
        String adminPass = System.getProperty("password");
        loginPage.doLogin(adminUser,adminPass);
        String textActual = driver.findElement(By.id("deactivate-wp-dark-mode")).getText();
        String textExpected = "Deactivate";

        Assert.assertEquals(textActual,textExpected);
    }
}
