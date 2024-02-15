package TestCase;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Browser.BrowserSetup;
import MemberInformationCOOP.MemberFive;
import MemberInformationCOOP.MemberFour;
import MemberInformationCOOP.MemberOne;
import MemberInformationCOOP.MemberSix;
import MemberInformationCOOP.MemberThree;
import MemberInformationCOOP.MemberTwo;
import Utilities.Methods;
import Utilities.Nibondhon2ndPage;
import Utilities.SamityNibondhonFirstPage;
import Utilities.SamityNibondhonSecondPage;
import Utilities.ThirdPage;

public class NineStepMemberCreation extends BrowserSetup{
	public By CommityPage = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By SodossoNibondhon_c = By.xpath("//button[@aria-label='আগের পাতায়']");
	public By SodossoNibondhonPage_c =By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By NewMemberAddButton_c = By.xpath("//button[contains(text(),'নতুন সদস্য যোগ করুন')]");
	public By NibondhonPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	
	MemberOne mOne = new MemberOne();
	MemberTwo mtwo =new MemberTwo();
	MemberThree mthree = new MemberThree();
	MemberFour mFour = new MemberFour();
	MemberFive mFIve = new MemberFive();
	MemberSix mSix =new MemberSix();

	LoginBaboharkari log = new LoginBaboharkari();
	SamityNibondhonFirstPage p1= new SamityNibondhonFirstPage();
	Nibondhon2ndPage p2= new Nibondhon2ndPage();
	ThirdPage p3 = new ThirdPage();

	//SamityNibondhonPage1 smp = new SamityNibondhonPage1();
	Methods method = new Methods();
	MemberOne m1 =new MemberOne();
	
	//landing on First Page 
	//Pre-requisitve : Must have created a samity previously
	SamityNibondhonFirstPage SamityNibondhonPage1 = new SamityNibondhonFirstPage();
	
	@Test(description = "Samity Name Use Input ")
	public void UpToAddMember() throws  InterruptedException, IOException, AWTException {
		log.Baboharkarilogin();
		
		//SamityName Input in First Page
		p1.firstpageInputs("S19");
		p2.secondPageDone();
		p3.page3();
		mOne.addMember();
		p3.page3();
		mtwo.addMember();
		p3.page3();
		mthree.addMember();
		p3.page3();
		mFour.addMember();
		p3.page3();
		mFIve.addMember();
		p3.page3();
		mFour.addMember();
		p3.page3();
		//smp.OsompurnoAbedonfirstpageInputs();
		}
	
	

}
