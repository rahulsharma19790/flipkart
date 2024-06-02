/*
import PageTest.BaseTest1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners  implements ITestNGListener {

    ExtentTest test;
    ExtentReports extent;



    public void onTestStart(ITestResult result)
    {
        extent.createTest(result.getMethod().getMethodName());
    }


    public void onTestSuccess(ITestResult result)
    {
        test.log(Status.PASS, "Test Case Passed");
    }


    public void onTestFailure(ITestResult result)
    {
        test.log(Status.FAIL, result.getThrowable());
        try {
            driver = (WebDriver) result.getTestClass().getRealClass().getField("driver")
                    .get(result.getInstance());
        } catch (Exception e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();

        }
        String path = null;
        try {
            path = getScreenShot(result.getMethod().getMethodName(),driver);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        test.addScreenCaptureFromPath(path,result.getMethod().getMethodName());
    }

    public void onFinish(ITestContext context)
    {

        extent.flush();

    }




}
*/
