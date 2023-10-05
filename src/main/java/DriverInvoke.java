import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverInvoke {

	public static AndroidDriver main(String[] args) throws MalformedURLException {
DesiredCapabilities cap = new DesiredCapabilities();
		
		File f=new File("src");
		File fs=new File(f,"Ae-commerce-android-app-demo.apk");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidDemo2");
	    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
	    
	    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,3000);
	    AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
	

	}

}
