package testProjectAndroid;

import io.appium.java_client.MobileElement;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumTest {
	public AndroidDriver<AndroidElement> driver;

	  @Before
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("device", "Google Pixel 5");
	    desiredCapabilities.setCapability("os_version", "11.0");
	    desiredCapabilities.setCapability("app", "BROWSERSTACK_APP_URL");
	    desiredCapabilities.setCapability("browserstack.networkLogs", "true");

	    driver = new AndroidDriver<AndroidElement>(new URL("http://<BROWSERSTACK_USERNAME>:<BROWSERSTACK_ACCESS_KEY>@hub-cloud.browserstack.com/wd/hub"), desiredCapabilities);
	  }

	  @Test
	  public void sampleTest() {
		  MobileElement el1 = (MobileElement) driver.findElementById("com.android.permissioncontroller:id/continue_button");
		    el1.click();
		    MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
		    el2.click();
	  }

	  @After
	  public void tearDown() {
	    driver.quit();
	  }

}