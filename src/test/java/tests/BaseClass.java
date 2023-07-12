package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

    AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup(){
        try {

        
        DesiredCapabilities caps = new DesiredCapabilities();
        // caps.setCapability("platformName", "ANDROID");
        // caps.setCapability("platformName", "ANDROID");
        caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "SM-A715F");
        caps.setCapability(MobileCapabilityType.UDID, "R58N65L2Y3Z");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
        // caps.setCapability(MobileCapabilityType.APP, "");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<MobileElement> (url, caps);
        driver = new AndroidDriver<MobileElement> (url, caps);

        }catch(Exception exp){
            System.out.println("cause is: "+exp.getCause());
        }

    }



    @AfterTest
     public void teardown(){
        
    }


    
}
