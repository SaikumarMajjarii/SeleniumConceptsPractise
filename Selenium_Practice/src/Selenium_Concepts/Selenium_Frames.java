import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
			
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Driver.get("https://jqueryui.com/droppable/");
		
		WebElement Fm = Driver.findElement(By.cssSelector(".demo-frame"));
		
		
		//Webelement 
		Driver.switchTo().frame(Fm);
		
		
		// index
		//Driver.switchTo().frame(0);
		WebElement Frame1Drag = Driver.findElement(By.cssSelector("div#draggable"));
		
		WebElement Frame2Drop = Driver.findElement(By.cssSelector("div#droppable"));
		
		
		
		Actions A = new Actions(Driver);

		A.dragAndDrop(Frame1Drag,Frame2Drop).build().perform();
		
		Driver.switchTo().defaultContent();
		
	}

}
