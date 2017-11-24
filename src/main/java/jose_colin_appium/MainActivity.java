package jose_colin_appium;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MainActivity extends BaseActivity{

	private final String DISPLAY_TEXT_BTN="io.selendroid.testapp:id/visibleButtonTest";
	private final String INPUT_TEXT="io.selendroid.testapp:id/my_text_field";
	private final String BTN_LONG="io.selendroid.testapp:id/buttonTest";
	private final String CHECK_BOX="io.selendroid.testapp:id/input_adds_check_box";
	private final String DIALOG_BTN="android:id/button1";
	
	
	
	
	public MainActivity(AndroidDriver<MobileElement> driver) {
		super(driver);
	}

	public void inicio() {
//		MobileElement btn=getDriver().findElement(By.id(DISPLAY_TEXT_BTN));
//		
//		btn.click();
//		
//		MobileElement input=getDriver().findElement(By.id(INPUT_TEXT));
//		
//		input.sendKeys("holaaa");
//		
//		MobileElement btn2=getDriver().findElement(By.id(BTN_LONG));
//		
//		TouchAction action = new TouchAction(getDriver());
//		action.longPress(btn2).release().perform();
//		MobileElement btn3=getDriver().findElement(By.id(DIALOG_BTN));
////		getWait().until(ExpectedConditions.visibilityOf(btn3));
//		btn3.click();
//		
//		
//		
//		MobileElement btn4=getDriver().findElement(By.id(CHECK_BOX));
//		
//		btn4.click();
		
//		MobileElement view = getDriver().findElement(By.className("android.widget.LinearLayout"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 TouchAction touchAction = new TouchAction(driver).press(240,390)
	                .moveTo(240, 75).release();
	        driver.performTouchAction(touchAction);
	        
	        System.out.println("aa");
	}

}
