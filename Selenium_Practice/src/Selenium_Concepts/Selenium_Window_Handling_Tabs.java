import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Window_Handling_Tabs {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");

		driver.get("https://www.facebook.com/");

		String Parent = driver.getWindowHandle();

		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("a.blinkingText")).click();

		driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();

		Thread.sleep(3000);

		// Window Handling
//
//		for(int i=1;i<=1;i++)
//		{
//			
//			driver.findElement(By.cssSelector("a.blinkingText")).click();
//			
//			
//		}

		Set<String> Windows = driver.getWindowHandles();

		List<String> Hlist = new ArrayList<String>(Windows);

		SwitchWindow("Rahul Shetty Academy", Hlist, driver);

		// switch_toParentWindow(Parent,driver);

	}

//	public static boolean SwitchWindow1(String WindowTitle ,List<String> Hlist, WebDriver driver)
//	{
//		for(String child : Hlist)
//		{
//			
//			String Title = driver.switchTo().window(child).getTitle();
//			
//			if(Title.contains(WindowTitle))
//				
//			{
//				
//				System.out.println("Right Window Found");
//				
//				return true;
//				
//			}
//				
//		}
//		return false;
//		
//		
//	}
//	

	public static boolean SwitchWindow(String WindowTitle, List<String> Hlist, WebDriver driver) {
		for (String child : Hlist) {

			String Title = driver.switchTo().window(child).getTitle();

			System.out.println(Title);

			WebElement Name = driver.findElement(By.xpath("//input[@name='firstname']"));
			
			
			Name.sendKeys("Sai Kumar");
			
			//to get Width and Height of the Edit Box present in Rect 
			Name.getRect().getHeight();
			Name.getRect().getWidth();

		}
		return false;

	}

	public static void switch_toParentWindow(String Parent, WebDriver driver) {
		driver.switchTo().window(Parent);

	}

}

// one way of traversing
// Set<String> Windows = driver.getWindowHandles();

//		
//		for(String Child : Windows)
//		{
//			
//			if(!Child.equalsIgnoreCase(Parent))
//			{
//				
//				driver.switchTo().window(Child);
//				
//				System.out.println(driver.getTitle());
//				
//			}
//		
//			
//		}
//		
//		
//		driver.switchTo().window(Parent);
