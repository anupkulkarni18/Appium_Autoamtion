package utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

/**
 * Created by CHITTU on 29-Oct-16.
 */
public class AndroiddriverController {
        AndroidDriver driver;

        public AndroidDriver setupAndroidDriver(String deviceName, String appPackage, String appActivity) throws Exception {

           DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME,"");
        capabilities.setCapability("deviceName",deviceName);
        capabilities.setCapability("platformName","");

        //app Packages name for the tested app, can get from the command adb shell pm list pacakges -f
        capabilities.setCapability("appPackage",appPackage);

        //app Activity name of the tested app, can get from the command adb shell pm list pacakges -f
        capabilities.setCapability("appActivity",appActivity);

        //wait to execute another command
        capabilities.setCapability("newCommandTimeout", 50000);

            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

            return driver;

        }

    }


