package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties prop;
    String path = "D:\\Amazon_Automation\\Amazon\\Config\\config.properties";
    public ReadConfig()
    {
        try {
       prop = new Properties();
       FileInputStream fis = new FileInputStream(path);
       prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getUrl()
    {
        String newUrl = prop.getProperty("baseUrl");
        if(newUrl!=null)
        {
            return newUrl;
        }
        else
            throw new RuntimeException("Url is not available");
    }
    public String getBrowser()
    {
        String browserV = prop.getProperty("browser");
        if(browserV!=null)
        {
            return browserV;
        }
        else
            throw new RuntimeException("Browser is not available");
    }
}
