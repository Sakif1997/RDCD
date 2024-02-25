package TestCase;

import java.io.IOException;

import org.testng.annotations.Test;

import Browser.BrowserSetup;
import Utilities.NameClearancePage;

public class NameClearanceTest extends BrowserSetup{
	LoginBaboharkari login = new LoginBaboharkari();
	NameClearancePage nc = new NameClearancePage();
	@Test(description = "Check system allow new name clearance(সমিতি নাম অনুমোদনের জন্য প্রেরণ ): Enter By User")
	public void NameClearance() throws InterruptedException, IOException{
		login.Baboharkarilogin();
		//Enter Name Every time
		nc.NameClearanceApply("টেস্ট সমিতি");
	}
}
 