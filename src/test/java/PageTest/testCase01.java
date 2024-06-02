package PageTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testCase01 extends BaseTest1 {



    // public static WebDriver driver;


    @Test
    public void setUp2() {
        // driver.get(url);
        FlipkartPage fp = new FlipkartPage(driver);
        fp.sellerButton();
        String newText = fp.sellerText();
        String newText2 = fp.textStory();
        System.out.println(newText + " " + newText2);

    }

}
