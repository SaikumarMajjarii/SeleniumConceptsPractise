package Selenium_Concepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class Selenium_AutoSuggestive_DD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
			
		Driver.manage().window().maximize();
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Driver.findElement(By.id("autosuggest")).sendKeys("Ar");
		
		Thread.sleep(4000);
		
		List<WebElement> Dropdown_Options = Driver.findElements(By.cssSelector("ul[id='ui-id-1'] li a"));

		
		for(WebElement Option:Dropdown_Options)
		{
			if(Option.getText().equalsIgnoreCase("Argentina"))
			{
				Option.click();
			
				break;
			}
		}
		

		
		
	}
	
	


}
