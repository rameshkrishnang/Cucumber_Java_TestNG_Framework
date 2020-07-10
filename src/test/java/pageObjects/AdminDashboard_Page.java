package pageObjects;

import commonUtils.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminDashboard_Page {

    public String pageTitle_AdminDashboard = "Crater - Self Hosted Invoicing Platform";

    public By logo_HeaderCrater(){
        return By.xpath("//a[@class='brand-main']");
    }

    public By tab_Dashboard(){
        return By.xpath("//a[@href='/admin/dashboard']");
    }

    public By tab_Customers(){
        return By.xpath("//a[@href='/admin/customers']");
    }

    public By tab_Items(){
        return By.xpath("//a[@href='/admin/items']");
    }

    public By label_AmountDue(){
        return By.xpath("//span[@class='title' and contains(text(), 'Amount Due')]");
    }

    public By label_Customers(){
        return By.xpath("//span[@class='title' and contains(text(), 'Customers')]");
    }

    public By label_Invoices(){
        return By.xpath("//span[@class='title' and contains(text(), 'Invoices')]");
    }

    public By label_Estimates(){
        return By.xpath("//span[@class='title' and contains(text(), 'Estimates')]");
    }

}