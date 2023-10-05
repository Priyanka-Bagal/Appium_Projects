import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;


public class LandingPage extends Basic {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver=capabilities();
		System.out.println("Application started");
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"App\"]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();
        driver.findElement(By.id("io.appium.android.apis:id/text_entry_button")).click();
        driver.findElement(By.id("io.appium.android.apis:id/username_edit")).sendKeys("LivingS");
        driver.findElement(By.id("io.appium.android.apis:id/password_edit")).sendKeys("LS123");
        driver.findElement(By.id("android:id/button1")).click();
        System.out.println("Entered Credentials");
        
	}

}
