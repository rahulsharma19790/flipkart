package PageTest;

import Pages.LandingPage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LandingPageTest extends BaseTest{
    //WebDriver driver;
    String mobile = "9811211087";
    @Test(priority = 1)
    public void goToCart() throws InterruptedException {
        LandingPage ldp = new LandingPage(BaseTest.driver);
        ldp.clickOnCart();
        String actualText = "Missing Cart items?";
        String msg1 = ldp.verifyEmptyText();
        Assert.assertEquals(actualText,msg1);
    }
    @Test(priority = 2)
    public void loginTest()
    {
        LandingPage ldp = new LandingPage(BaseTest.driver);
        LoginPage lp = new LoginPage(BaseTest.driver);
        ldp.clickOnCart();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        lp.clickOnLogin();
        lp.setEnterEmail(mobile);
       // lp.sendOtpClick();
    }
}
