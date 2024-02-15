package Browser;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSetup {
	
	//static ExtentTest test;
	//static ExtentReports report;
	
	private static String BrowserName = System.getProperty("browser", "Edge");
	private static final ThreadLocal<WebDriver> DRIVER_LOCAL = new ThreadLocal<>();
	public static WebDriver getDriver() {
		return DRIVER_LOCAL.get();
	}
	public static void setDriver(WebDriver driver) {
		BrowserSetup.DRIVER_LOCAL.set(driver);
	}
	public static WebDriver getBrowser(String BrowserName) {
		switch (BrowserName.toLowerCase()) {
		case "chrome":
			ChromeOptions option1 = new ChromeOptions();
			option1.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver(option1);
		case "edge":
			EdgeOptions option2 = new EdgeOptions();
			option2.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver(option2);
		case "firefox":
			FirefoxOptions option3 = new FirefoxOptions();
			option3.addArguments("--remote-allow-origins=*");
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver(option3);
		default:
			throw new RuntimeException("Browser Not found");
		}
	}
	
	@BeforeSuite
	public static synchronized void setBrowser() {
//		ExtentReports report = new ExtentReports();
//		test = report.startTest("ExtentDemo");
		WebDriver webDriver = getBrowser(BrowserName);
		webDriver.manage().window().maximize();
		setDriver(webDriver);
	}
	@AfterSuite
	public static synchronized void quitBrowser() {
		getDriver().quit();
	}
	
	
	
	 //public ExtentReports extent;
    static ExtentReports report;
    public ExtentTest test;


    @BeforeTest
    public void setExtent(){

        report = new ExtentReports("htmlReports/RDCD.html");
        test = report.startTest("Automation Test");

        report.addSystemInfo("Server", "-------------");
        report.addSystemInfo("Module", "-------------");
        report.addSystemInfo("Feature", "-------------");
        report.addSystemInfo("Activity", "-------------");
        report.addSystemInfo("QA Engineer", "Sakif Abdullah");

        report.addSystemInfo("Framework", "Selenium");
        report.addSystemInfo("Language", "Java");
        report.addSystemInfo("IDEA", "IntelliJ IDEA");
        report.addSystemInfo("Browser", "Chrome");
        report.addSystemInfo("Browser", "Chrome");


    }

    @AfterTest
    public void endReport() {
        report.endTest(test);
        report.flush();
    }
// ==================================== For Reporting Purpose (End) =========================================

	
    // capture screenshots in Extent Report
    public static String capture(WebDriver driver) throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File Dest = new File("failureSS/"+ "screenshot_failure.png");
        String errflpath = Dest.getAbsolutePath();
        FileUtils.copyFile(scrFile, Dest);
        return errflpath;
    }

	
	
	
	
}


