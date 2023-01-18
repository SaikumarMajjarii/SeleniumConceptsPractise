package Selenium_Concepts;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Open_Multiple_Tabs_OR_Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
		Set<String> Handles = driver.getWindowHandles();
		
		
		   Iterator<String > IT = Handles.iterator();
		   
		  String parent = IT.next();
		  String Child = IT .next();
		  
		  
		  driver.switchTo().window(Child);
		  
		
		driver.get("https://courses.rahulshettyacademy.com/courses");
		
		
		System.out.println(driver.findElements(By.cssSelector(".course-listing-title")).get(3).getText());
		System.out.println(Handles.size());
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("(//*[@name='name'])[1]")).sendKeys("SaiKumar");
	}

}
