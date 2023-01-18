package Selenium_Concepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class Selenium_E2E_Calendar_Handling {

	static WebDriver Driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.redbus.in/");
		
	
		WebDriverWait  W = new WebDriverWait(Driver,Duration.ofSeconds(30));
		
		W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".fl.search-box.date-box.gtm-onwardCalendar")));
		
		Driver.findElement(By.cssSelector(".fl.search-box.date-box.gtm-onwardCalendar")).click();
		
		
		ClickDate("Dec","2100","31");

		Driver.quit();
	}
	
	
	
	
	public static String[] SplitMonthYear (String MonthYear)
	{

		return MonthYear.split(" ");
	
	}
	
	

	public static void ClickDate(String Month,String Year ,String Date)
	{
		
		
		
		if(Month.equals("Feb") && Integer.parseInt(Date) > 29)
		{
			
			System.out.println("Wrong Date Given for FEB   "+ Date);
		}
		
		if(Integer.parseInt(Date)>32)
		{
			
			System.out.println("Wrong Date Given for Other Months "+ Date);
			
		}
		

		
		String MonthYear  = Driver.findElement(By.cssSelector(".monthTitle")).getText();
		
		
		while(! (SplitMonthYear(MonthYear)[0].equals(Month) &&  SplitMonthYear(MonthYear)[1].equals(Year)))
		{		
			Driver.findElement(By.cssSelector(".next")).click();
			MonthYear  = Driver.findElement(By.cssSelector(".monthTitle")).getText();
			
		}
		
		
		List<WebElement >Dates = Driver.findElements(By.xpath("//*[@class='rb-monthTable first last']//tr[2]//following-sibling::tr//td"));
		
		for(WebElement D : Dates)
			
		{
	
			if(D.getText().contentEquals(Date))
			{		

					D.click();
					break;
			}
			
		}
		
		
	}

	
	//.monthTitle
			
}
