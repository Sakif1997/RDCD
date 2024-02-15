package TestCase;

import org.testng.annotations.Test;

import Browser.BrowserSetup;
import Utilities.LoginPages;

public class LoginUser extends BrowserSetup{
	LoginPages login =new LoginPages();
	@Test(description = "Login By User")
	public void User() throws InterruptedException{
		getDriver().get("http://10.11.200.30:3090/login");
		login.LoginByUser();
		Thread.sleep(2000);
	}
}
