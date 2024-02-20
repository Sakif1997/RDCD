package Utilities;

import org.openqa.selenium.By;

public class SamityNibondhon2ndUpdatePage extends Methods {
    public By page2_w = By.xpath("//span[@class='doc-title']");
    public By SaveButton_c = By.xpath("//button[@aria-label='সংরক্ষন করুন']");
    public void Page2() throws InterruptedException{
        WaitElementVisible(page2_w);
        ScrollDown();
        clickElement(SaveButton_c);
    }
}
