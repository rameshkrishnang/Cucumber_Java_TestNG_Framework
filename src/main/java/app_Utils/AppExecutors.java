package app_Utils;

import Runner.TestRunner;
import commonUtils.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AppExecutors extends TestRunner {

    //Page Objects
    public By text_ToasterMessage(){
        return By.xpath("//div[@class='toast-message']");
    }



    //Methods
    public void verifyToasterMessage(String toasterMessage) {
        String actualMessage = driver.findElement(text_ToasterMessage()).getText();
        String expectedMessage = toasterMessage;
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
