import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2E_Selenium_DropDowns {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
			
		Driver.manage().window().maximize();
		
		
		Driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		//Auto Suggestions
		
		
		Driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		
		Thread.sleep(4000);
		
		List<WebElement> Dropdown_Options = Driver.findElements(By.cssSelector("ul[id='ui-id-1'] li a"));

		
		for(WebElement Option:Dropdown_Options)
		{
			if(Option.getText().equalsIgnoreCase("India"))
			{
				Option.click();
			
				break;
			}
		}
		
		
		//Another way : - td > input[value='OneWay']
		
		Driver.findElement(By.xpath("(//*[@value='OneWay'])[1]")).click();
		
		Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		
		Driver.findElement(By.cssSelector("div[id='ctl00_mainContent_ddl_originStation1_CTNR'] a[value='BLR']")).click();
		
		
		
		String D1 = Driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).getAttribute("value");
		
		Assert.assertEquals(D1, "Bengaluru (BLR)");
		
		System.out.println(D1);
		
		Driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']")).click();
		
		String D2 = Driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).getAttribute("value");
		
		Assert.assertEquals(D2, "Chennai (MAA)");
		
		
		Driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		Driver.findElement(By.cssSelector(".paxinfo")).click();
		
		Thread.sleep(2000);
		
		Driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		
		
		Driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();
		
		WebElement StaticDD = Driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		
		
		Select SDD = new Select(StaticDD);
		Thread.sleep(3000);

		SDD.selectByVisibleText("USD");
		
		
		
		
		if(Driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			
			
				System.out.println("the Date Picker is Disabled");
			
			
				Assert.assertTrue(true);
		}
		
		else
			
		{
			Assert.assertFalse(true);
		}
		
		
		Driver.quit();
		
	}

}
//
//if(Driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
//{
//	
//	
//		System.out.println("the Date Picker is Disabled");
//	
//	
//		Assert.assertTrue(true);
//}
//
//else
//	
//{
//	Assert.assertFalse(true);
//}
//
//
//Driver.quit();