import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.com/?currency=INR&language=en_US");
		
		
		Actions Ac = new Actions(driver);
		
		WebElement Hover = driver.findElement(By.xpath("//*[contains(@data-csa-c-content-id,'signin')]"));

		
		//Hovering
		Ac.moveToElement(Hover).build().perform();
		
		
		WebElement Text = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
		
		
		//Multiple Chains
		Ac.moveToElement(Text).click().keyDown(Keys.SHIFT).sendKeys("SAIKUMAR MAJJARI").doubleClick().build().perform();
		
		
		
		//Right CLick
		Ac.moveToElement(Hover).contextClick().build().perform();
		
		
	}

}
