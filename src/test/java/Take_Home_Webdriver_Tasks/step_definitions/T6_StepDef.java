package Take_Home_Webdriver_Tasks.step_definitions;

import Take_Home_Webdriver_Tasks.pages.The_InternetPage;
import Take_Home_Webdriver_Tasks.utilities.Driver;
import Take_Home_Webdriver_Tasks.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class T6_StepDef extends TestBase {
    The_InternetPage page = new The_InternetPage();

    @Given("user is on the dropdown page")
    public void user_is_on_the_dropdown_page() {
        setUpBaseUrl("/dropdown");
    }
    @When("user clicks on the dropdown option")
    public void user_clicks_on_the_dropdown_option() {

        page.dropdown.click();

    }
    @Then("verify user select option one")
    public void verify_user_select_option_one() {
        Select options = new Select(Driver.getDriver().findElement(By.id("dropdown")));

        options.selectByValue("1");

        String actualOption1 = options.getFirstSelectedOption().getText();
        String expectedOption1 = "Option 1";

        Assert.assertEquals(expectedOption1,actualOption1);

    }
    @Then("verify user select option two")
    public void verify_user_select_option_two() {

        Select options = new Select(Driver.getDriver().findElement(By.id("dropdown")));

        options.selectByValue("2");

        String actualOption2 = options.getFirstSelectedOption().getText();
        String expectedOption2 = "Option 2";

        Assert.assertEquals(expectedOption2,actualOption2);
    }
}
