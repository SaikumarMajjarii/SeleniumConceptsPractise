import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_StaticDropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
			
		Driver.manage().window().maximize();
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		

		
		
		WebElement StaticDD = Driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		
		
		Select SDD = new Select(StaticDD);
		Thread.sleep(3000);
		
		SDD.selectByIndex(2);
		
		SDD.selectByValue("INR");
		
		SDD.selectByVisibleText("USD");
		
		List<WebElement> options = SDD.getOptions();
		
		for(WebElement Option : options)
		{
			
			System.out.println(Option.getText());
			
		}
		

		
	}

}


