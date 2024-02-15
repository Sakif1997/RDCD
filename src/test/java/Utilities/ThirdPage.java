package Utilities;

import org.openqa.selenium.By;


public class ThirdPage extends Methods{
	public By page3_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");

	//public By page3_w = By.xpath("//span[@class='doc-title']");
	public By NewMemberAddButton_c = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public void page3() throws InterruptedException{
		WaitElementVisible(page3_w);
		Thread.sleep(2000);
		clickElement(NewMemberAddButton_c);
	}

}
