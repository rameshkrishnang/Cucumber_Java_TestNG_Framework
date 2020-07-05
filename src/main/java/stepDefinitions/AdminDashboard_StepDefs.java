package stepDefinitions;

import cucumber.api.java.en.*;
import executors.AdminDashboard_Executor;

public class AdminDashboard_StepDefs extends AdminDashboard_Executor{

    @And("^I validate the Crater Admin Dashboard is displayed$")
    public void i_validate_the_crater_admin_dasnboard_is_displayed() throws Throwable {
        verify_crater_admin_dashboard();
    }
}
