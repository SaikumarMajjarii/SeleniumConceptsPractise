package Selenium_Concepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Weddriver_Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
			
		Driver.manage().window().maximize();
		
		Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		WebElement Footer = Driver.findElement(By.cssSelector("div#gf-BIG"));
		
		
		
		System.out.println(Footer.findElements(By.tagName("a")).size());

		
		
		WebElement ColumnLinks = Footer.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		
		System.out.println(Footer.findElements(By.xpath("//tbody/tr/td[1]/ul/li")).size());
		

		System.out.println(ColumnLinks.findElements(By.tagName("a")).size());
		
		
		for(int i =1;i<ColumnLinks.findElements(By.tagName("a")).size();i++)
		{
			
			String OpenEachLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnLinks.findElements(By.tagName("a")).get(i).sendKeys(OpenEachLink);	
			
			
			
		}
		
		
		
		Set<String> Tabs = Driver.getWindowHandles();
		
		
		Iterator<String > IT = Tabs.iterator();
		
		while(IT.hasNext())
		{
			
			System.out.println(Driver.switchTo().window(IT.next()).getTitle());
			
		}
		
		
		
//		WebElement Footer = Driver.findElement(By.xpath("//tbody/tr/td[1]/ul/li"));
	}

}
