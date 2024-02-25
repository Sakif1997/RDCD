package Utilities;

import org.openqa.selenium.By;

public class SamityMoneyExchangeInfoPage7 extends Methods{
    public By joma1_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //আয়(30000000)
    public By InputMoney1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By joma2 = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //মেয়াদী জমা(20301027)
    public By InputMoney2_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions1_c = By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[4]");
    //loop(8times)

    public By khoroch1_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //এসবিপি ঋণ (10601015)
    public By khorochInputMoney1_in = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By Khoroch2_in_enter = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/div[1]/input[1]");
    //ভাড়া এবং কর(40101043)
    public By KhorochInputMoney2_in  = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/div[1]/input[1]");
    //"৫০০০"
    public By canceloptions2_c = By.xpath("//body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[3]/td[4]");
    //loop(8times)
    public By Budgetpage_w = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1 css-8knn9q']");

    public By SaveToNextPage = By.xpath("//button[@aria-label='সংরক্ষন করুন']");
    public void SamityArthikInfoPage7() throws InterruptedException{
        KeybordInputSelectOption(joma1_in_enter,"আয়(30000000)");
        FieldValue(InputMoney1_in,"৫০০০");
        Thread.sleep(2000);
        KeybordInputSelectOption(joma2,"মেয়াদী জমা(20301027)");
        FieldValue(InputMoney2_in,"৫০০০");
        for(int i=0; i<=7; i++){
            clickElement(canceloptions1_c);
            Thread.sleep(1500);
        }
        KeybordInputSelectOption(khoroch1_in_enter,"এসবিপি ঋণ (10601015)");
        FieldValue(khorochInputMoney1_in,"৫০০০");
        Thread.sleep(2000);
        KeybordInputSelectOption(Khoroch2_in_enter,"ভাড়া এবং কর(40101043)");
        FieldValue(KhorochInputMoney2_in,"৫০০০");
        for(int i=0; i<=7; i++){
            clickElement(canceloptions2_c);
            Thread.sleep(1500);
        }
        takeScreenshot("joma - khoroch");
        clickElement(SaveToNextPage);
        Thread.sleep(2000);
        WaitElementVisible(SaveToNextPage);
    }



}
