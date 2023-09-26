package seleniumScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Open a Chrome browser
		// Webdriver -- is an interface
		// chromeDriver ==> implementing class of WebDriver
		// dirver is the object
	WebDriver driver = new ChromeDriver(); // open the browser
	
	// In the browser ==> enter a URL
	// For any automation on webpagse-- selenium gives lots of methods
	// Browser related methods
	// 1. get("url"): this method will enter the URL in the browser window
	
     driver.get("https://www.selenium.dev/");
     
     // Print the title of the webpage
     
     String title = driver.getTitle();
     System.out.println("The title of the page is : " + title);
     
     String url = driver.getCurrentUrl();
     
     System.out.println("The URL of the page is : " + url);
	
	// close the browser window
     
     driver.close();
     
     
	
	}

}






