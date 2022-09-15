package Take_Home_Webdriver_Tasks.step_definitions;

import Take_Home_Webdriver_Tasks.pages.The_InternetPage;
import Take_Home_Webdriver_Tasks.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class T3_StepDef  extends TestBase{
    The_InternetPage page = new The_InternetPage();
    @Given("user is on the checkboxes page")
    public void user_is_on_the_checkboxes_page() {
        setUpBaseUrl("/checkboxes");
    }
    @Then("verify checkbox one is NOT selected by default")
    public void verify_checkbox_one_is_not_selected_by_default() {
        Assert.assertFalse("C1 is selected",page.checkBox1.isSelected());

    }
    @Then("verify checkbox two is SELECTED by default")
    public void verify_checkbox_two_is_selected_by_default() {
        Assert.assertTrue("C2 is not selected",page.checkBox2.isSelected());
    }


}
