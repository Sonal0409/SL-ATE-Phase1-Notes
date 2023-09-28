package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemoXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		// the below xpath used will return a list 6 tags, in which if we want to have a single tag selected 
		// we use get(index number) method
		// for this use case we also use findElements()
		
		driver.findElements(By.xpath("//input[@name='color']")).get(1).click();
		
		driver.findElements(By.xpath("//input[@name='color']")).get(3).click();
		
		driver.findElements(By.xpath("//input[@name='color']")).get(4).click();
		
		

	}

}
