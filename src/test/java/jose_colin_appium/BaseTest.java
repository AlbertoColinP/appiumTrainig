package jose_colin_appium;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest {
	
	AndroidDriver<MobileElement> driver;
	private MainActivity mainActivity;
	
	@BeforeMethod
	public void setUp() throws IOException {
		File classpathRoot = new File("C:\\Users\\jose.colin");
        File appDir = new File(classpathRoot, "Desktop");
        File app = new File(appDir.getCanonicalPath(), "ApiDemos-debug.apk");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "4200ec41ee0ea300"); 
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.0");
		caps.setCapability("clearSystemFiles", "true");
		caps.setCapability("app", app.getAbsolutePath());
		caps.setCapability("appPackage", "io.appium.android.apis");
		caps.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				 driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
		mainActivity= new MainActivity(driver);
	}
	
	public MainActivity getMainActivity() {
		return mainActivity;
	}

}
