package Utilities;

import org.openqa.selenium.By;

public class NameApprovalPage extends Methods{
	public By LandingPage_wv = By.xpath("//p[contains(text(),'নিবন্ধন প্রদান')]");
	public By KarzokromBabosthapona_c = By.xpath("//span[contains(text(),'কার্যক্রম ব্যবস্থাপনা')]");
	public By KarzokromBabosthaponaPage_w= By.name("serviceId");
	public By NewSamitiAcceptanceOption_c = By.xpath("//tbody/tr[1]/td[6]//*[name()='svg']//*[name()='path' and contains(@d,'M19 3H5c-1')]");
	public By NameClearanceApprovalPage_w = By.xpath("//span[contains(text(),'সমিতির নাম :')]");
	//scroll down
	public By OnumodonDropdownList_c = By.name("serviceActionId");
	//অনুমোদন
	public By Onumodon_c = By.xpath("//button[@aria-label='অনুমোদন করুন']");
	public By BacktolistPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By ProfileIcon_w = By.xpath("//button[@aria-label='account of current user']//*[name()='svg']");
	public By logout =By.xpath("//div[@id='primary-search-account-menu']//li[@role='menuitem'][contains(text(),'লগ-আউট')]");
	// Samity Acceptance
	//SamityAcceptance.java
	public void NameApproveSamity() throws InterruptedException{
		WaitElementVisible(LandingPage_wv);
		clickElement(KarzokromBabosthapona_c);
		Thread.sleep(2000);
		WaitElementVisible(KarzokromBabosthaponaPage_w);
		clickWaitElement(NewSamitiAcceptanceOption_c);
		WaitElementVisible(NameClearanceApprovalPage_w);
		Thread.sleep(2000);
		takeScreenshot("Visible for accept Smaity");
		ScrollDown();
		Thread.sleep(2000);
		DropDownSelectByVisibleText(OnumodonDropdownList_c, "অনুমোদন");
		Thread.sleep(3000);
		clickElement(Onumodon_c);
		WaitElementVisible(BacktolistPage_w);
		Thread.sleep(1000);
		takeScreenshot("Accepted notification");
		Thread.sleep(5000);
		//WaitElementVisible(ProfileIcon_w);
		clickWaitElement(ProfileIcon_w);
		Thread.sleep(1500);
		clickWaitElement(logout);
	}
}
