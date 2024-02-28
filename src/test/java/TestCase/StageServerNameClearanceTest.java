package TestCase;

import Browser.BrowserSetup;
import Utilities.NameClearancePage;
import org.testng.annotations.Test;

import java.io.IOException;

public class StageServerNameClearanceTest extends BrowserSetup {
    StageLoginBaboharkari login = new StageLoginBaboharkari();
    NameClearancePage nc = new NameClearancePage();
    @Test(description = "Check system allow new name clearance(সমিতি নাম অনুমোদনের জন্য প্রেরণ ): Enter By User")
    public void NameClearance() throws InterruptedException, IOException {
        login.Baboharkarilogin();
        //Enter Name Every time
        nc.NameClearanceApply("ইরা ইনফোটেক পারুল আপু আরডিসিডি সমবায় সমিতি-5");
    }

}
