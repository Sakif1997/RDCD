package TestCase;

import Browser.BrowserSetup;
import Utilities.NibondhonRequestPage10;
import Utilities.OsompurnoAbedonPages;
import Utilities.SamityBudgetPage8;
import Utilities.SamityDocumentPage9;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class OsompurnoAbedon extends BrowserSetup {
    LoginBaboharkari log = new LoginBaboharkari();
    OsompurnoAbedonPages oap = new OsompurnoAbedonPages();
    SamityBudgetPage8 oap1 = new SamityBudgetPage8();
    SamityDocumentPage9 oap2 = new SamityDocumentPage9();
    NibondhonRequestPage10 oap10 = new NibondhonRequestPage10();
    @Test
    public void Osompurno() throws InterruptedException, IOException, AWTException {
        log.Baboharkarilogin();
        oap.OsompurnoAbedonfirstpageInputs("QA Test-12");//connect
       // oap.AfterAddMemberPage3();
       // oap.ComityPodobiPage();
       // oap.ArthikinfoPage();
       //// oap.SamityJomaKorochPage();
        //oap.SamityArthikInfoPage7();
       // oap1.BudgeSelection();
        oap2.DocumentAttachments();
        oap10.FinalPage();


    }

}
