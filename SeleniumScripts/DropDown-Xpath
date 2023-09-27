package seleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.ironspider.ca/forms/dropdowns.htm");
		
		// Select the drop down
		// To write xpath locator use the following syntax:
		// syntax:  //tagname[@attribute='value']
		
		 WebElement e1 =   driver.findElement(By.xpath("//select[@name='coffee']"));
		 
		 // Selecting the drop down and to perfoem an action on it, we have to create an object of Select class in selenium
		 
		//Using the Select class method we can perform actions on the drop down
			
		 Select dd = new Select (e1);
		 
		 // Any one of these methods can be choosen
		 
		 dd.selectByIndex(1); // this method will select value at index 1 in drop down
		 
		 Thread.sleep(1500);
		 
		 dd.selectByValue("sugar"); // this method will select the list using value attribute of options
		 
		 Thread.sleep(1500);
		 
		 dd.selectByVisibleText("Crisp (har har...)");
		
		 // Get all the options form the drop down and store it in the list
		 
		 List<WebElement> li = dd.getOptions();
		 
		 System.out.println("The size of the list:" + li.size());
		 
		 // print all the values of the drop down
		 
		 for(WebElement l: li)   // for each loop
		 {
			 System.out.println(l.getText());
		 }
		 
	

	}

}
