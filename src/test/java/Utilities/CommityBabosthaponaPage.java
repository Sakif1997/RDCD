package Utilities;

import org.openqa.selenium.By;

public class CommityBabosthaponaPage extends Methods{
    public By MemberSelect_d = By.name("organizerp");
    //জিহাদ
    //নিলা
    //নাইম
    //মোমেন
    //অর্ণব
    //তৌফিক
    public By ConnectionInfo_d = By.name("communicationP");
    //নিলা
    public By CommityMemberNumber_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]");
    //৬ জন//thread

    public By MemberOne_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/select[1]");
    //জিহাদ
    public By MemberTwo_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/select[1]");
    //নিলা
    public By MemberThree_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/div[1]/select[1]");
    //নাইম
    public By MemberFour_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/div[1]/select[1]");
    //মোমেন
    public By MemberFive_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/div[1]/select[1]");
    //অর্ণব
    public By MemberSix_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/div[1]/select[1]");
    //তৌফিক

    public By MemberOnePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/select[1]");
    //সভাপতি
    public By MemberTwoPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/select[1]");
    //সহ-সভাপতি
    public By MemberThreePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/div[1]/select[1]");
    //কোষাধ্যক্ষ
    public By MemberFourPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/div[1]/select[1]");
    //ট্রেজারার
    public By MemberFivePodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/div[1]/div[1]/select[1]");
    //সহ-সভাপতি
    public By MemberSixPodobi_d = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/div[1]/div[1]/select[1]");
    //সদস্য
    public By SaveButton_c = By.xpath("//button[@aria-label='সংরক্ষন করুন']");

    public By SamityNationalButton_c =By.xpath("//input[@aria-label='controlled']");
    public By natinalSamityPersonSelect_drop =By.name("signingp");
    public void ComityPodobiPage() throws InterruptedException{
        DropDownSelectByVisibleText(MemberSelect_d,"জিহাদ");
        DropDownSelectByVisibleText(ConnectionInfo_d,"নিলা");
        clickElement(SamityNationalButton_c);


        DropDownSelectByVisibleText(natinalSamityPersonSelect_drop,"অর্ণব");
        DropDownSelectByVisibleText(CommityMemberNumber_d,"৬ জন");

        Thread.sleep(4000);
        DropDownSelectByVisibleText(MemberOne_d,"জিহাদ");
        DropDownSelectByVisibleText(MemberTwo_d,"নিলা");
        DropDownSelectByVisibleText(MemberThree_d,"নাইম");
        DropDownSelectByVisibleText(MemberFour_d,"মোমেন");
        DropDownSelectByVisibleText(MemberFive_d,"অর্ণব");
        DropDownSelectByVisibleText(MemberSix_d,"তৌফিক");
        Thread.sleep(3000);
        DropDownSelectByVisibleText(MemberOnePodobi_d,"সভাপতি");
        DropDownSelectByVisibleText(MemberTwoPodobi_d,"সহ-সভাপতি");
        DropDownSelectByVisibleText(MemberThreePodobi_d,"কোষাধ্যক্ষ");
        DropDownSelectByVisibleText(MemberFourPodobi_d,"ট্রেজারার");
        DropDownSelectByVisibleText(MemberFivePodobi_d,"সহ-সভাপতি");
        DropDownSelectByVisibleText(MemberSixPodobi_d,"সদস্য");
        takeScreenshot("Members Designation");
        Thread.sleep(3000);
        clickElement(SaveButton_c);
    }
}
