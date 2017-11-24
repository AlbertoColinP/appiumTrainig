package jose_colin_appium;


import org.testng.annotations.Test;


public class TestAppium extends BaseTest{

	@Test
	public void test() {
		MainActivity mainActivity=getMainActivity();
		
		mainActivity.inicio();
	}

}
