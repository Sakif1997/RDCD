package TestCase;

import Browser.BrowserSetup;
import Utilities.*;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.IOException;

public class OsompurnoAbedon extends BrowserSetup {
    LoginBaboharkari log = new LoginBaboharkari();
    StageLoginBaboharkari logstage = new StageLoginBaboharkari();



    OsompurnoAbedonPages oap = new OsompurnoAbedonPages();
    SamityBudgetPage8 oap1 = new SamityBudgetPage8();
    SamityDocumentPage9 oap2 = new SamityDocumentPage9();
    NibondhonRequestPage10 oap10 = new NibondhonRequestPage10();
    CommityBabosthaponaPage p4 = new CommityBabosthaponaPage();


    @Test
    public void Osompurno() throws InterruptedException, IOException, AWTException {
        //log.Baboharkarilogin();//for local server
        logstage.Baboharkarilogin();//for stage server

        oap.OsompurnoAbedonfirstpageInputs("Stage server flow সমিতি 02-17/4/2024");//connect
       // oap.AfterAddMemberPage3();
       // oap.ComityPodobiPage();
       // oap.ArthikinfoPage();
       //// oap.SamityJomaKorochPage();
        //oap.SamityArthikInfoPage7();
       // oap1.BudgeSelection();
        p4.ComityPodobiPage();
    }
}
