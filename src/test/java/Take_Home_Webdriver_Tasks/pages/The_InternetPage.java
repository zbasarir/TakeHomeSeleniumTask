package Take_Home_Webdriver_Tasks.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class The_InternetPage extends BasePage{
    @FindBy (xpath = "//*[@id=\"checkboxes\"]/input[1]")
    public WebElement checkBox1;

    @FindBy (xpath = "//*[@id=\"checkboxes\"]/input[2]")
    public WebElement checkBox2;

    @FindBy (id="hot-spot")
    public WebElement contextMenuBox;

    @FindBy (id="column-a")
    public WebElement elementA;

    @FindBy (id="column-b")
    public WebElement elementB;

    @FindBy (id="dropdown")
    public WebElement dropdown;




}
