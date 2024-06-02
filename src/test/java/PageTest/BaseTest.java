package PageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {
   public  static WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=true");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().deleteAllCookies();

    }

    @AfterMethod
    public void driverClose()
    {
        driver.quit();
    }
}
