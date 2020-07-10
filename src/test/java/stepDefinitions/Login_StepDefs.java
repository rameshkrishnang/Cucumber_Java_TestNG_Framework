package stepDefinitions;

import io.cucumber.java.en.*;
import executors.Login_Executor;

public class Login_StepDefs extends Login_Executor {

    @Given("^I open the Crater web application$")
    public void i_open_the_crater_web_application(){
        open_application();
    }

    @And("^I validate the Login Page is displayed$")
    public void i_validate_the_login_page_is_displayed() {
        verify_login_page_is_displayed();
    }

    @Then("^I login as admin user$")
    public void i_login_as_admin_user() {
        login_as_admin();
    }
}
