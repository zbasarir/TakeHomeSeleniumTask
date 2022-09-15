package Take_Home_Webdriver_Tasks.pages;

import Take_Home_Webdriver_Tasks.utilities.ConfigurationReader;
import Take_Home_Webdriver_Tasks.utilities.Driver;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }






}
