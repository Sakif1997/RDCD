package Utilities;

import org.openqa.selenium.By;


public class ThirdPage extends Methods{
	public By page3_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");

	//public By page3_w = By.xpath("//span[@class='doc-title']");
	public By NewMemberAddButton_c = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public void page3() throws InterruptedException{
		WaitElementVisible(page3_w);
		Thread.sleep(2000);
		clickWaitElement(NewMemberAddButton_c);
	}
	public By NextPage_w_c = By.xpath("//button[contains(text(),'পরবর্তী পাতায়')]");
	public By CommityBabosthaponaPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");//remove
	public void AfterAddMemberPage3() throws InterruptedException{
		//clickElement(SodossoPageIcon_c);
		clickWaitElement(NextPage_w_c);
		WaitElementVisible(CommityBabosthaponaPage_w);
		Thread.sleep(2000);
	}

}
