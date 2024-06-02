package PageTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

public class ReadDataFromJson {
    WebDriver driver;

    @Test(dataProvider =  "getData")
    public void enterData(HashMap<String, String> input)
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(" //img[@class='-dOa_b L_FVxe']")).click();
        driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys(input.get("mobile"));
        //driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
       // driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
        driver.close();

    }

    /*@DataProvider
    public Object[][] getData()
    {
       return new Object[][] {{"9811211087","abcd","abcd@abcd34.com"},{"9876598765","abcde","abcde@abcde2.com"},{"9879879876","abcdef","abcde@abcdef2.com"}};
    }*/

    @DataProvider
    public Object[][] getData()
    {
        HashMap<String, String> data = new HashMap<>();
        data.put("mobile","9811211087");
        data.put("mobile","9876598765");
        data.put("mobile","9879879876");
        return new Object[][] {{data}};
    }

}
