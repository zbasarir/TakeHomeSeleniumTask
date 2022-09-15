package Take_Home_Webdriver_Tasks.step_definitions;

import Take_Home_Webdriver_Tasks.pages.The_InternetPage;
import Take_Home_Webdriver_Tasks.utilities.Driver;
import Take_Home_Webdriver_Tasks.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;

public class T4_Stepdef extends TestBase {
    The_InternetPage page = new The_InternetPage();
    @Given("user is on the context menu page")
    public void user_is_on_the_context_menu_page() {
        setUpBaseUrl("/context_menu");
    }
    @When("user right click on the box")
    public void user_right_click_on_the_box() {
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(page.contextMenuBox).perform();

    }
    @Then("verify JavaScript alert text")
    public void verify_java_script_alert_text() {

        Alert alert = Driver.getDriver().switchTo().alert();
        Assert.assertEquals("You selected a context menu",alert.getText());
    }
}
