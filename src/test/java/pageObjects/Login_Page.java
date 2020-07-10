package pageObjects;

import org.openqa.selenium.By;

public class Login_Page {

    public String pageTitle_LoginPage = "Crater - Self Hosted Invoicing Platform";

    public By logo_Crater(){
        return By.xpath("//a[@href='/admin']");
    }

    public By label_Email(){
        return By.xpath("(//p[@class='input-label'])[1]");
    }

    public By textbox_Email(){
        return By.xpath("//input[@name='email']");
    }

    public By label_Password    (){
        return By.xpath("(//p[@class='input-label'])[1]");
    }

    public By textbox_Password(){
        return By.xpath("//input[@name='password']");
    }

    public By link_ForgetPassword(){
        return By.xpath("//a[@class='forgot-link']");
    }

    public By button_Login(){
        return By.xpath("//button[contains(@class, 'base-button')]");
    }

}