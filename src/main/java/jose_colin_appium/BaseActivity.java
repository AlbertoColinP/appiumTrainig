package jose_colin_appium;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseActivity {

	protected AndroidDriver<MobileElement> driver;
	protected WebDriverWait wait;

	public BaseActivity(AndroidDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		wait = new WebDriverWait(driver, 10);

	}
	
	
	public void click(MobileElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}

	
}
