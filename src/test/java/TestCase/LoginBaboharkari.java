package TestCase;


import java.io.IOException;

import org.testng.annotations.Test;

//import com.relevantcodes.extentreports.LogStatus;

import Browser.BrowserSetup;
import Utilities.LoginPages;

public class LoginBaboharkari extends BrowserSetup{
	LoginPages login =new LoginPages();
	@Test(description = "login by baboharkari")
	public void Baboharkarilogin() throws InterruptedException, IOException{
		getDriver().get("http://10.11.200.30:3050/login");
		login.loginAsBaboharkari("01686026037");
		//login.loginAsBaboharkari("200000071938");
		Thread.sleep(2000);
	}
}
