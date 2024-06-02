package PageTest;

import Utilities.ReadConfig;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
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
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class BaseTest1 {
    ExtentTest test;
    ExtentSparkReporter reporter;
    ExtentReports extent;
    ReadConfig rc = new ReadConfig();
   String url
           = rc.getUrl();
  // String browser;
                  // = rc.getBrowser();
    public static WebDriver driver;



    @BeforeTest
    @Parameters("browser")
   public void setUp(String browser) throws Exception {
        /*WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();*/
        //driver.get(url);
       /*switch (browser.toLowerCase())
       {
           case "chrome":
               ChromeOptions op = new ChromeOptions();
               op.addArguments("--headless=true");
               WebDriverManager.chromedriver().setup();
               driver = new ChromeDriver();
               driver.manage().window().maximize();
               break;
           case "firefox" :
               WebDriverManager.firefoxdriver().setup();
               driver = new FirefoxDriver();
               driver.manage().window().maximize();
               break;
           case "edge" :
               WebDriverManager.edgedriver().setup();
               driver = new EdgeDriver();
               driver.manage().window().maximize();
               break;

           default:
               driver = null;
               break;*/

           if (browser.equalsIgnoreCase("firefox")) {
               WebDriverManager.firefoxdriver().setup();
               FirefoxOptions op = new FirefoxOptions();
               op.addArguments("--headless=true");
               driver = new FirefoxDriver(op);
           } else if (browser.equalsIgnoreCase("chrome")) {
               WebDriverManager.chromedriver().setup();
               ChromeOptions op1 = new ChromeOptions();
               op1.addArguments("--headless=true");
             driver = new ChromeDriver(op1);
           } else if (browser.equalsIgnoreCase("Edge")) {
               WebDriverManager.edgedriver().setup();
               EdgeOptions op2 = new EdgeOptions();
               op2.addArguments("--headless=true");
            driver = new EdgeDriver(op2);
           } else {
            throw new Exception("Incorrect Browser");
             }
           driver.get(url);
          // return driver;
    }

    /*public  void  initialize() throws Exception {
        driver = setUp();
        driver.get(url);
    }*/
    @AfterTest
    public void tearDown()
    {
         driver.quit();
        //driver.close();
    }

    public String getScreenShot(String testCaseName, WebDriver driver) throws IOException, IOException {
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File destFile = new File(System.getProperty("user.dir")+"\\reports1\\" + testCaseName +".png");
        FileUtils.copyFile(src, destFile);
        return System.getProperty("user.dir")+"\\reports1\\" + testCaseName +".png";
    }

   /* @BeforeTest
    public void ExtentReportConfig()
    {
        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Flipkart automation");
        reporter.config().setDocumentTitle("Test Result");

        extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Rahul Sharma");
    }*/
}
