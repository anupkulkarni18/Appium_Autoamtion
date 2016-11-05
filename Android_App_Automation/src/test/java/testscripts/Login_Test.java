package testscripts;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeClass;
import utils.AndroiddriverController;

/**
 * Created by CHITTU on 29-Oct-16.
 */
public class Login_Test {
    private static io.appium.java_client.android.AndroidDriver driver;

    @BeforeClass
    public  void beforeTest() throws Exception {
        System.out.println("Before class \n");

        AndroiddriverController setUpdriver = new AndroiddriverController();
        driver = setUpdriver.setupAndroidDriver("Moto-G","appPacakeName","appActivityName");
    }
}
