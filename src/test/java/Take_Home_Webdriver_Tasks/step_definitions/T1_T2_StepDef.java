package Take_Home_Webdriver_Tasks.step_definitions;

import Take_Home_Webdriver_Tasks.pages.LoginPage;
import Take_Home_Webdriver_Tasks.utilities.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class T1_T2_StepDef extends TestBase {

    LoginPage page = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
      setUpBaseUrl("/login");

    }
    @When("user enters {string} credentials")
    public void user_enters_credentials(String userType) {
        page.loginDynamically(userType);

    }

    @Then("user should see {string} msg")
    public void user_should_see_msg(String lgnMsg) {

        String actualMsg = page.loginPageMsg.getText();
        Assert.assertTrue("No Match!",actualMsg.contains(lgnMsg));


    }

}
