package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import Browser.BrowserSetup;
import Utilities.DuplicateNameApproval;

public class DuplicateNameInputValidation extends BrowserSetup{
	LoginBaboharkari login = new LoginBaboharkari();
	DuplicateNameApproval nc = new DuplicateNameApproval();
	@Test(description = "System not take any duplicate Samity Name(Caution message:সমিতিটির নাম বিদ্যমান রয়েছে\r\n"
			+ ")")
	public void DupNameApproval() throws InterruptedException, IOException{
		login.Baboharkarilogin();
		nc.DupNameApply();	
	}
}
