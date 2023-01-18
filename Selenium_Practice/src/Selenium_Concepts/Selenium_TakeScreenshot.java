import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		

		WebDriver Driver = new ChromeDriver();

		Driver.manage().window().maximize();

		Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
		File SRC = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(SRC,new File("C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\Selenium_Screenshots\\S1.png"));
		
		
		
		
		
		//Partial Screenshot of any WebElement 
		WebElement Cap = Driver.findElement(By.xpath("//*[contains(text(),'Radio Button Example')]"));
		File Buttonsrc = Cap.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(Buttonsrc,new File("C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\Selenium_Screenshots\\s2.png"));
	

	}

}
