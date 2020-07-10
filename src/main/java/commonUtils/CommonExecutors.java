package commonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonExecutors extends BaseClass implements Executors {

    public void verifyPageTitle(String expected_title) {
        String actualTitle = driver.getTitle();
        String expectedTitle = expected_title;
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    public void textbox_EnterValue(By by, String data) {
        WebElement textbox = driver.findElement(by);
        textbox.clear();
        textbox.sendKeys(data);
    }

    public void dropdown_SelectVisibleText(By by, String data) {

    }

    public void button_click(By by) {
        WebElement button = driver.findElement(by);
        button.click();
    }

    public void button_submit(By by) {
        WebElement button = driver.findElement(by);
        button.submit();
    }

    public void link_click(By by) {

    }

    public void take_screenshot(String filename) {

    }

    public String timestamp() {
        return null;
    }

    public void move_to_another_tab() {

    }

    public void sleep(long time) {

    }

    public void wait_until_page_load() {

    }

    public void waitForElementToBeDisplayed(By by, long timeOutInSecs) {
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSecs);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }



}
