package MemberInformationCOOP;

import java.awt.AWTException;

import org.openqa.selenium.By;

import Utilities.Methods;

public class MemberSix extends Methods{
	UploadMethod upload = new UploadMethod();
	public By NibondhonPage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");
	public By JatiyoPorichoi_c = By.xpath("//span[@class='MuiTypography-root MuiTypography-body1 MuiFormControlLabel-label css-9l3uo3'][contains(text(),'জাতীয় পরিচয়পত্র')]");
	public By jatioPorichoiID_in = By.name("nid");
	//৯০৭৬৭৭৪৪২৩
	//৯০৭৬৭৭৪৪৩৩
	//৯০৭৬৭৭৪৪৩৬
	//৯০৭৬৭৭৪৪৩৮
	//৯০৭৬৭৭৪৪৩৫
	//৯০৭৬৭৭৪৪৩৭
	
	public By jonmotarik_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]");
	//22011989
	public By NameEnglish_in= By.name("memberName");
	//ZIHAD
	//NILA
	//NAIEM
	//MOMEN
	//ARNOB
	//TAWFIQ
	public By NameBangla_in= By.name("memberNameBangla");
	//জিহাদ 
	//নিলা
	//নাইম 
	//মোমেন 
	//অর্ণব 
	//তৌফিক
	public By FatherName_in= By.name("fatherName");
	//শাহেদ
	//আব্দুল
	//মোশাররফ
	//আবুল
	//মাহমুদ
	//অর্ণব হোসাইন 
	public By MotherName_in= By.name("motherName");
//	ফাতেমা
//	আয়েশা
//	জেহান
//	সুমাইয়া
//	রুকাইয়া
	public By MobileName_in= By.name("mobile");
	//01718192871
	public By MemberApplyDate_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[9]/div[1]/div[1]/input[1]");

	public By GenderMale_c = By.xpath("//span[contains(text(),'পুরুষ')]");
	public By GenderFeMale_c = By.xpath("//span[contains(text(),'মহিলা')]");
	public By educationQualification_Drop =By.name("educationLevelId");
	//স্নাতক
	public By ocupation_Drop =By.name("occupationId");
	//বেসরকারী চাকুরীজীবি
	public By religion_drop =By.name("religionId");
	//ইসলাম
	public By Unmarried_drop =By.name("maritalStatusId");
	//অবিবাহিত
	public By upojila_drop =By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]");
	//মণিরামপুর
	public By thana_drp =By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/select[1]");
	//মণিরামপুর
	public By SameAddress_c =By.xpath("//input[@type='checkbox']");
	public By PersonImageSelect_c =By.xpath("//label[@for='0']//span[@role='button'][contains(text(),'সংযুক্ত করুন')]");
	public By PersonSignatureSelect_c =By.xpath("//label[@for='1']//span[@role='button'][contains(text(),'সংযুক্ত করুন')]");
	public By PersonDOcumentSelect_c =By.xpath("//label[@for='2']//span[@role='button'][contains(text(),'সংযুক্ত করুন')]");

	public By SaveButton_c =By.xpath("//button[@aria-label='সংরক্ষন করুন']");
	public By x =By.xpath("");
	
	public void addMember() throws InterruptedException,  AWTException{
		WaitElementVisible(NibondhonPage_w);
		clickElement(JatiyoPorichoi_c);
		Thread.sleep(2000);
		FieldValue(jatioPorichoiID_in, "৯০৭৬৭৭৪৪৩৭");
		FieldValue(jonmotarik_in, "22011989");
		FieldValue(NameEnglish_in, "TAWFIQ");
		FieldValue(NameBangla_in, "তৌফিক");
		FieldValue(FatherName_in, "জিহাদ");
		FieldValue(MotherName_in, "ফাতেমা");

		FieldValue(MobileName_in, "01523451761");
		FieldValue(MemberApplyDate_in, "01012024");
		clickElement(GenderMale_c);
		Thread.sleep(2000);
		DropDownSelectByVisibleText(educationQualification_Drop, "স্নাতক");
		DropDownSelectByVisibleText(ocupation_Drop, "বেসরকারী চাকুরীজীবি");
		Thread.sleep(2000);
		DropDownSelectByVisibleText(religion_drop, "ইসলাম");
		DropDownSelectByVisibleText(Unmarried_drop, "অবিবাহিত");
		DropDownSelectByVisibleText(upojila_drop, "মণিরামপুর");
		Thread.sleep(2000);
		DropDownSelectByVisibleText(thana_drp, "মণিরামপুর");
		Thread.sleep(2000);
		clickElement(SameAddress_c);//change request
		//Thread.sleep(2000);
		clickElement(PersonImageSelect_c);
		Thread.sleep(2000);
		upload.Upload("E:\\Eclipse Files\\RDCD\\Upload_Images\\6.png");
		clickElement(PersonSignatureSelect_c);
		Thread.sleep(2000);
		upload.Upload("E:\\Eclipse Files\\RDCD\\Upload_Images\\signature.png");
		clickElement(PersonDOcumentSelect_c);
		Thread.sleep(2000);
		upload.Upload("E:\\Eclipse Files\\RDCD\\Upload_Images\\Document.png");
		Thread.sleep(2000);
		clickElement(SaveButton_c);
		Thread.sleep(2000);

	}
}

