package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseC {
    static WebDriver driver;
    public BaseC(WebDriver driver)
    {
        this.driver = driver;
    }
    public static void implicitWait(int duration)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
    }
    public static void explicitWait(int duration, WebElement ele)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
    public static void clickAble(int duration, WebElement ele)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
        wait.until(ExpectedConditions.elementToBeClickable(ele));
    }

}
