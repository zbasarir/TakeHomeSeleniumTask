package Take_Home_Webdriver_Tasks.step_definitions;

import Take_Home_Webdriver_Tasks.pages.The_InternetPage;
import Take_Home_Webdriver_Tasks.utilities.Driver;
import Take_Home_Webdriver_Tasks.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class T5_StepDef extends TestBase {

    The_InternetPage page = new The_InternetPage();
    @Given("user is on the drag and drop page")
    public void user_is_on_the_drag_and_drop_page() {
        setUpBaseUrl("/drag_and_drop");

    }

    @When("user drags element A and drop into element B")
    public void user_drags_element_a_and_drop_into_element_b() {

        Actions actions = new Actions(Driver.getDriver());
       actions.dragAndDrop(page.elementA, page.elementB).perform();
    }
    @Then("verify the text on element A and B are switched.")
    public void verify_the_text_on_element_a_and_b_are_switched() {

    }
}
