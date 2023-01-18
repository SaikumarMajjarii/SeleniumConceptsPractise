package Selenium_Concepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Dynamic_WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		List<WebElement> Rows = Driver.findElements(By.xpath("//*[@name='courses']/tbody/tr"));
		
		System.out.println(Rows.size());
		
		List<WebElement> Cloumns = Driver.findElements(By.xpath("//*[@name='courses']/tbody/tr[1]/th"));
		
		
		System.out.println(Rows.get(2).findElements(By.tagName("td")).get(0).getText());
	
	}

}





//
//WebElement table=driver.findElement(By.id("product"));
//
//
//
//System.out.println(table.findElements(By.tagName("tr")).size());
//
//
//
//System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//
//
//List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//
//
//System.out.println(secondrow.get(0).getText());
//
//
//
//System.out.println(secondrow.get(1).getText());
//
//
//
//System.out.println(secondrow.get(2).getText());
//
//}
//
//}
