package Selenium_Concepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Get_Column_And_Row_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		
		int RowCount = driver.findElements(By.cssSelector("table#customers tr")).size();
		
		int ColumnCount = driver.findElements(By.cssSelector("table#customers th")).size();
		
		
		for(int i=2;i<=RowCount;i++)
		{
			
				
			for(int j=1;j<=ColumnCount;j++)
			{
				
				String actvalue = driver.findElement(By.xpath("//*[@id='customers']/tbody/tr["+i+"]/td["+j+"]")).getText();
				
				
				if(actvalue.equals("Italy"))
				{
					System.out.println("Row : "+ i + " Column "+ j);
					
					break;
				}
				
			}
		
	
		}
		
		
		
		for(int col=1;col<=ColumnCount;col++)
		{
			
			String ColPresent = driver.findElement(By.cssSelector("table#customers tr th:nth-child("+col+")")).getText();
			
			if(ColPresent.equalsIgnoreCase("Country"))
			{
				
				System.out.println("Country COl Name is Present : " + ColPresent+ " in Column :"+col);
			}
			
		}
		
		
		
	
	}
}
