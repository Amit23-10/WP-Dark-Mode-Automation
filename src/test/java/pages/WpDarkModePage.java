package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WpDarkModePage {
    @FindBy(css = "[class=\'wp-menu-name wp-dark-mode-ignore\']")
    List<WebElement> menuItems;

//    @FindBy(css = "[class=\'router-link-active router-link-exact-active nav-item-child focus:outline-none active\']")
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/a[2]")
    WebElement adminPanelDarkModeButton ;

    @FindBy(css = "[class=\'relative w-10 h-full rounded-full transition duration-100 bg-slate-200\']")
    WebElement enableAdminDashboardDarkMode;

    @FindBy(css = "[class=\'disabled:opacity-50 disabled:cursor-not-allowed inline-flex items-center gap-2 px-4 py-2 text-sm font-medium rounded-md cursor-pointer outline-none focus:outline-none hover:opacity-90 transition duration-75 bg-blue-500 text-white border border-blue-500\']")
    WebElement saveButton ;

    @FindBy(css = "[class=\'flex items-center justify-between cursor-pointer py-3 px-4 focus:ring rounded-lg focus:ring-blue-400 transition\']")
    List<WebElement> customizationButtton ;

//    @FindBy(css = "[class=\'router-link-active router-link-exact-active nav-item-child focus:outline-none active\']")
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[1]")
    WebElement buttonSwitchButton ;

//    @FindBy(css = "[class=\'_selected bg-[#F9FAFB] flex flex-col items-center justify-center transition duration-75 rounded-lg relative cursor-pointer w-36 h-36\']")
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]")
    WebElement normalSwitchButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[6]/span[1]")
    WebElement customButton;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")
    WebElement sizepicker ;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]/div[1]")
    WebElement positionSwitch ;

    @FindBy(css ="[class=\'text-base leading-6 wp-dark-mode-white\']")
    List<WebElement> advancedButton;

    @FindBy(css = "[class=\'nav-item-child focus:outline-none inactive\']")
    List<WebElement> accessibilityButton;

    @FindBy(css = "[class=\'relative w-10 h-full rounded-full transition duration-100 bg-blue-600\']")
    WebElement keyboardShortcutButton ;

    @FindBy(css = "[class=\'wp-dark-mode-ignore\']")
    List<WebElement> darkModeButton ;



    public WpDarkModePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void enableDarkMode(){
        menuItems.get(5).click();  //wp dark mode
        adminPanelDarkModeButton.click();  //click on admin panel dark mode
        enableAdminDashboardDarkMode.click(); // enable button
        saveButton.click(); //save changes
//        saveButton.click();
    }

    public void changeFloatingSwitch(){
        customizationButtton.get(1).click(); // click on customization buttton
        buttonSwitchButton.click(); // click on switch settings
        normalSwitchButton.click(); // click on second switch
    }
    public void changeSwitchSettings(){
        customButton.click();
        sizepicker.click();
        sizepicker.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        sizepicker.sendKeys("220");
        sizepicker.sendKeys(Keys.ENTER);
    }

    public void changeSwitchPosition(){
        positionSwitch.click();
        saveButton.click();
    }

    public void disableKeyboardShortcut(){
        advancedButton.get(1).click();
        accessibilityButton.get(9).click();
        keyboardShortcutButton.click();
        saveButton.click();

    }

    public void darkModeView(){
        darkModeButton.get(85).click();
    }

}
