package executors;

import Runner.TestRunner;
import app_Utils.AppExecutors;
import commonUtils.BaseClass;
import commonUtils.CommonExecutors;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.AdminDashboard_Page;
import pageObjects.Login_Page;

public class Login_Executor extends BaseClass {

    Login_Page loginPage = new Login_Page();
    AppExecutors appExecutors = new AppExecutors();
    CommonExecutors commonExecutors = new CommonExecutors();

    // Open Crater Web Application
    public void open_application() {
        String url = config.getProperty("url");
        OpenBrower();
        driver.get(url);
    }

    // Verify Login Page is displayed
    public void verify_login_page_is_displayed() {
        commonExecutors.waitForElementToBeDisplayed(loginPage.logo_Crater(), 60);
        commonExecutors.verifyPageTitle(loginPage.pageTitle_LoginPage);
        Assert.assertTrue(driver.findElement(loginPage.label_Email()).isDisplayed());
        System.out.println("Login Page is displayed");
    }

    //Login as Admin
    public void login_as_admin(){
        String username = config.getProperty("admin_email");
        String password = config.getProperty("admin_password");
        commonExecutors.textbox_EnterValue(loginPage.textbox_Email(), username);
        commonExecutors.textbox_EnterValue(loginPage.textbox_Password(), password);
        commonExecutors.button_submit(loginPage.button_Login());
        commonExecutors.waitForElementToBeDisplayed(appExecutors.text_ToasterMessage(), 120);
        appExecutors.verifyToasterMessage("Login Successful");
        System.out.println("Login Successful");
    }

}
