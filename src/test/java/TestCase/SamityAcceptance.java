package TestCase;

import org.testng.annotations.Test;

import Browser.BrowserSetup;
import Utilities.LoginPages;
import Utilities.NameApprovalPage;

public class SamityAcceptance extends BrowserSetup{
	LoginPages login =new LoginPages();
	NameApprovalPage NMP = new NameApprovalPage();
	@Test(description = "New Samity Approved By উপজেলা সমবায় অফিসার")
	public void NewSamityNameApproval() throws InterruptedException{
		getDriver().get("http://10.11.200.30:3090/login");
		login.LoginByUser();
		Thread.sleep(2000);
		NMP.NameApproveSamity();
	}
}
