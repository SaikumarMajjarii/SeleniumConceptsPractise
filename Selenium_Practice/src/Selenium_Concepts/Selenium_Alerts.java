package Selenium_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Selenium_Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("Majjari Saikumar");
		
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		
		Thread.sleep(3000);
	
		if (driver.switchTo().alert().getText().contains("Majjari Saikumar"))
		{
			
			System.out.println("Name is Dispalyed");
		}
		
		else
		{
			Assert.assertTrue(false);
			System.out.println("Name not Displayed");
		}
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#confirmbtn")).click();
		
		Thread.sleep(1000);
		driver.switchTo().alert().dismiss();
	
		
	}
	
	
	

}
