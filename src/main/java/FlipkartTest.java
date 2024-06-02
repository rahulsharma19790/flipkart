import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.testng.TestInstanceParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {



        public static void main(String[] args) {
            WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com");
        driver.findElement(By.xpath("//a[@class='_3RX0a- _3jeYYh']")).click();
        String text = driver.findElement(By.xpath("//span[@class='style__ColoredSpan-sc-1iksw1-1 bvEpHv']")).getText();
        System.out.println(text);

   /* public void TC_01()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://flipkart.com");
        driver.findElement(By.xpath("//a[@class='_3RX0a- _3jeYYh']")).click();
        String text = driver.findElement(By.xpath("//span[@class='style__ColoredSpan-sc-1iksw1-1 bvEpHv']")).getText();
        System.out.println(text);
    }*/

    }



}
