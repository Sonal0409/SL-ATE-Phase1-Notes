package seleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// click on the sign in button and alert should be displayed
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1500);
		
		// We will not make driver object to switch from main window of app to alert window
		// once we switch to alery we will use Alert class object to perform actions on the alert
		// we can perform 3 actions on the alert : getText, send keys, press ok or cancel button
		
		Alert a = driver.switchTo().alert();

		String alertText= a.getText();
		System.out.println(alertText);
		
		a.accept(); // click on yes or OK
		
		// if you want to press on cancel or NO button a.dismiss();
		
	// After this use driver object to enter username and password on the text box:
		
		driver.findElement(By.id("login1")).sendKeys("admin");
		
		driver.findElement(By.id("password")).sendKeys("admin");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
