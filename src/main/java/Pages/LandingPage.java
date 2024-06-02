package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BaseC {
    WebDriver driver;
    public LandingPage(WebDriver driver)
    {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "a[href*='viewcart']:first-child")
    WebElement cartButton;
    @FindBy(xpath = "//div[@class='s2gOFd']")
    WebElement emptyCartText;

    public void clickOnCart()
    {
        clickAble(2,cartButton);
        cartButton.click();
    }
    public String verifyEmptyText()
    {
        implicitWait(5);
        String msg= emptyCartText.getText();
        return msg;

    }

}

