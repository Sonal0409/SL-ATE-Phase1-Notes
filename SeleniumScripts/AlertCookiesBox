package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAcceptcookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opera.com/download");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//div[@class='cookie-consent__body'])[1]/descendant::span[1]")).click();
	
	}

}
