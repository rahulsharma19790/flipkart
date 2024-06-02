package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends BaseC{
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = ".aEsfVh")
   private  WebElement loginButton;
    @FindBy(css="input.r4vIwl")
    private WebElement enterEmail;
    @FindBy(xpath="//button[text()='Request OTP']")
    private WebElement sendOtp;

    public void clickOnLogin()
    {
       clickAble(2,loginButton);
        loginButton.click();
    }
    public void setEnterEmail(String mobile)
    {   //explicitWait(2,enterEmail);
        enterEmail.sendKeys(mobile);
    }
    public void sendOtpClick()
    {
        sendOtp.click();
    }
}
