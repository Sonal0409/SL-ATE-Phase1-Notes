package Phase1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleWindowandPopup {

	
	// 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	    
	    // Lets capture the unique id of the main home window
	    
	   String parent_win = driver.getWindowHandle();
	   
	   System.out.println(parent_win);
	  
	    driver.findElement(By.xpath("(//div[@class='widget HTML'])[25]/descendant::a")).click();
	    
	    // Now gather all the windows unique ids
	    
	    Set<String> s1 = driver.getWindowHandles();
	    
	   Iterator<String> itr = s1.iterator();
		
		String parent_window = itr.next();
		
		System.out.println(parent_window);
		
		String child_window= itr.next();
		
		System.out.println(child_window);
		
        driver.switchTo().window(child_window);
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.xpath("//h2[text()='404 Not found']")).getText();
		System.out.println(text);
		
		driver.switchTo().window(parent_window);
		
		driver.findElement(By.xpath("//div[@id='footer-3']/descendant::a")).click();
		
		Set<String> s2 = driver.getWindowHandles();
		
		Iterator<String> itr2 = s2.iterator();
		
		while(itr2.hasNext())
		{
			String win = itr2.next();
			
			driver.switchTo().window(win);
			
			if(driver.getTitle().contains("Blogger.com - Create a unique and beautiful blog easily.")) {
				driver.findElement(By.xpath("//a[@class='sign-in ga-header-sign-in']/child::*")).click();
				break;
			}
		}
		
		driver.switchTo().window(parent_window);
		
	//OR	// driver.switchTo().defaultContent(); // not working now.
		
		driver.close();

	}

}
