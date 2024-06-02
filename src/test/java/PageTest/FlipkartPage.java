package PageTest;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

import static PageTest.BaseTest.driver;

public class FlipkartPage {
   public static WebDriver driver;
    public FlipkartPage(WebDriver driver) {
       FlipkartPage.driver = driver;
        PageFactory.initElements( driver, this);
    }
    @FindBy(xpath = "//a[@class='_3RX0a- _3jeYYh']")
    private WebElement seller;
    @FindBy(xpath = "//span[@class='style__ColoredSpan-sc-1iksw1-1 bvEpHv']")
    private WebElement becomeSellerText;

    @FindBy(xpath = "//span[@class='styles__ColoredSpan-sc-1cttfwj-2 ibnKqc']")
    private WebElement storyText;

    public void sellerButton()
    {
        seller.click();
    }

    public String sellerText()
    {
        String text1 = becomeSellerText.getText();
        return text1;
    }

    public String textStory()
    {
        String text2 = storyText.getText();
        return text2;
    }



}
