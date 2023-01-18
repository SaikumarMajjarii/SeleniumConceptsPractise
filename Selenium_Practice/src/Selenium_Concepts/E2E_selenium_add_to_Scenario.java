import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class E2E_selenium_add_to_Scenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		

		String[] ProductsToAdd = {"Cucumber","Brocolli","Mushroom"};
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
			
		Driver.manage().window().maximize();
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		
		Add_Items(Driver,ProductsToAdd);
		
		
		Driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		Driver.findElement(By.xpath("//*[text()='PROCEED TO CHECKOUT']")).click();
		
		Driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		Driver.findElement(By.cssSelector(".promoBtn")).click();
		
		
		
		
		//new WebDriverWait(Driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")))
		
		WebDriverWait  W = new WebDriverWait(Driver,Duration.ofSeconds(15));
		
			W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		
		String Code  = Driver.findElement(By.cssSelector(".promoInfo")).getText();
		
		System.out.println(Code);
		//Driver.quit();

	}
	
	
	
	public static void  Add_Items(WebDriver Driver, String[] ProductsToAdd ) throws InterruptedException
	{

		int j =0;
		List<WebElement> Products = Driver.findElements(By.cssSelector(".product-name"));
		
			List Addproducts = Arrays.asList(ProductsToAdd);  
			
			System.out.println(Products.size());
			
			for(int i=0;i<Products.size();i++)
			{
				
				String[] ProductOnWebSite = Products.get(i).getText().split("-");
				
				String ProductOnWeb = ProductOnWebSite[0].trim();
				
				
				
				if(Addproducts.contains(ProductOnWeb))
				{
					
					
					Driver.findElements(By.cssSelector(".product-action > button")).get(i).click();
					
					//Driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					
					if (j==ProductsToAdd.length) {
						
						
						break;
					}
					
				}	
				
			}
		
	}
}












