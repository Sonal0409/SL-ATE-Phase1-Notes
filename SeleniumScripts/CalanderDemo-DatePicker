package seleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // maxamize the window
		
		driver.manage().deleteAllCookies(); // delete the cookies of the browser
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		// click on the text box of Dat field, so that calender is displayed
		
		driver.findElement(By.xpath("//input[contains(@id,'picker')]")).click();
		
		Thread.sleep(1500);
		
		// Once the calander opens, lets inspect the month and year and then print its text on console
		
		// whenever we have to get text of an element- getText()
		
		String monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		System.out.println(monthyear);
		
		// Split the string monthyear, we will get 2 new strings
		// and Create an Array object that will store the string month and year.
		// my : it is an array which is storing month  and year as 2 string values
		String my[] = monthyear.split(" ");
		
		String month = my[0];  // September
		String year = my[1];   // 2023
		
		while(!(month.equals("August") && year.equals("2024")))
		{
			// click on the next button of the calander
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		// come out of the loop
		
		monthyear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	
		month = monthyear.split(" ")[0];  // August
		year = monthyear.split(" ")[1];   // 2024
		}
		
		// Select the data as 14 and click on it
		
		
		driver.findElement(By.xpath("//a[text()='14']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
