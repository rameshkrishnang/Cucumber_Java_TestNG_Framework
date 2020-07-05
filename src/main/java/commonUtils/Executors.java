package commonUtils;

import org.openqa.selenium.By;

public interface Executors {

    /**
     * This method will verify the page title
     * @param expected_title - The expected page title to be verified with actual page title
     *
     */
    public void verifyPageTitle(String expected_title);


    /**
     * This method will enter the value to the text box using
     * @param by - Used to identify the text box
     * @param data - The data to be sent to the text box
     *
     */
    public void textbox_EnterValue(By by, String data);


    /**
     * This method will enter the value in drop down using
     * @param by - Used to select the drop down
     * @param data - The data to be sent to the drop down input
     *
     */
    public void dropdown_SelectVisibleText(By by, String data);


    /**
     * This method will click the button
     * @param by - Used to identify the button to be clicked
     *
     */
    public void button_click(By by);


    /**
     * This method will click the link
     * @param by - Used to identify the link to be clicked
     *
     */
    public void link_click(By by);


    /**
     * This method will take screenshot
     * @param filename - File Name to be provided
     *
     */
    public void take_screenshot(String filename);


    /**
     * This method will give time stamp
     *
     */
    public String timestamp();


    /**
     * This method will move the control from one tab to another tab
     *
     */
    public void move_to_another_tab();


    /**
     * This method will wait for mentioned time
     * @param time - Waiting time
     *
     */
    public void sleep(long time);


    /**
     * This method will wait until page to load
     *
     */
    public void wait_until_page_load();




}
