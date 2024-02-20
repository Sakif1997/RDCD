package TestCase;

import Browser.BrowserSetup;
import Utilities.OsompurnoAbedonPages;
import org.testng.annotations.Test;

import java.io.IOException;

public class OsompurnoAbedon extends BrowserSetup {
    LoginBaboharkari log = new LoginBaboharkari();
    OsompurnoAbedonPages oap = new OsompurnoAbedonPages();
    @Test
    public void Osompurno() throws InterruptedException, IOException {
        log.Baboharkarilogin();
        oap.OsompurnoAbedonfirstpageInputs("QA Test-5");
        //connect
       // oap.AfterAddMemberPage3();
       // oap.ComityPodobiPage();
        oap.ArthikinfoPage();
        oap.SamityJomaKorochPage();
    }

}
