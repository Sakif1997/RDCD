package Utilities;

import org.openqa.selenium.By;

public class SamityJomaKorochPage extends Methods{
    public By SamityJomaKoroch_w = By.xpath("/html[1]/body[1]/div[1]/main[1]/div[1]/div[1]/div[2]/div[2]/header[1]/div[1]/div[1]/div[1]/p[1]");
    public void Samity_JomaKorochPage() throws InterruptedException{
        WaitElementVisible(SamityJomaKoroch_w);
        Thread.sleep(4000);

    }
}
