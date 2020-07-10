package executors;

import commonUtils.BaseClass;
import runner.TestRunner;
import commonUtils.CommonExecutors;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjects.AdminDashboard_Page;

public class AdminDashboard_Executor extends BaseClass {

    AdminDashboard_Page adminDashboardPage = new AdminDashboard_Page();;
    CommonExecutors commonExecutors = new CommonExecutors();

    // Verify Crater Admin Dashbaord is displayed
    public void verify_crater_admin_dashboard() {
        commonExecutors.waitForElementToBeDisplayed(adminDashboardPage.label_AmountDue(), 120);
        commonExecutors.verifyPageTitle(adminDashboardPage.pageTitle_AdminDashboard);
        WebElement tab_Dashboard = driver.findElement(adminDashboardPage.tab_Dashboard());
        Assert.assertTrue(tab_Dashboard.getAttribute("class").contains("router-link-exact-active"));
        Assert.assertTrue(driver.findElement(adminDashboardPage.label_AmountDue()).isDisplayed());
        System.out.println("Crater Admin Dashboard is displayed");
    }

}
