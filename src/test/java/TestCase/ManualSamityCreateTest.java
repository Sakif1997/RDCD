package TestCase;

import Browser.BrowserSetup;
import Utilities.ManualSamityCreationPage;
import Utilities.ManualSamityLogin;
import org.testng.annotations.Test;

import java.awt.*;

public class ManualSamityCreateTest extends BrowserSetup {
    ManualSamityLogin login = new ManualSamityLogin();
    ManualSamityCreationPage mcp = new ManualSamityCreationPage();
    @Test
    public void ManualSamity() throws InterruptedException, AWTException {
        getDriver().get("http://10.11.200.30:3090/login");
        login.LoginByManualUser();
        for(int i=35; i<=50; i++) {
            mcp.SamityOnlineForManual("Manual Samity"+i+"-4/4/2024");
            Thread.sleep(2000);
        }
    }
}
