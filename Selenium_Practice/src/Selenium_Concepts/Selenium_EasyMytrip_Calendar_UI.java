package Selenium_Concepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Selenium_EasyMytrip_Calendar_UI {

	
	
	
	String MyYear;
	String MyDate ;
	String MyMonth;
	 public Selenium_EasyMytrip_Calendar_UI(String Year,String Date,String Month)
		{
			
		 	MyYear = Year;
		 	MyDate = Date ;
		 	MyMonth = Month;
			
		}

	public static String getMonth(WebDriver driver, String Year)

	{

		while (!driver.findElement(By.cssSelector("div.month")).getText().contains(Year))

		{
			driver.findElement(By.cssSelector("div[class='month-sec'] img[id='img2Nex']")).click();

		}
		return Year;

	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Selenium_EasyMytrip_Calendar_UI UI = new Selenium_EasyMytrip_Calendar_UI("2025","24","DEC");
	
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		options.addArguments("disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.easemytrip.com");

		Thread.sleep(7000);

		
		
//	WebDriverWait W =  new  WebDriverWait(driver,Duration.ofSeconds(15));
//	
//	W.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Departure']")));

//	driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//input[@placeholder='Departure']")).click();

		System.out.println(driver.findElement(By.cssSelector("div.month")).getText());

		getMonth(driver, UI.MyYear);

		while (!driver.findElement(By.cssSelector("div.month")).getText().contains(UI.MyMonth))

		{
			driver.findElement(By.cssSelector("div[class='month-sec'] img[id='img2Nex']")).click();

		}

		List<WebElement> Dates = driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li"));

		int Count = driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).size();

		System.out.println(driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).size());

		for (int i = 0; i < Count; i++)

		{

			String Text = driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).get(i).getText();

			if (Text.contains(UI.MyDate))

			{

				driver.findElements(By.cssSelector("div[class='box'] div[class='days'] li")).get(i).click();

				System.out.println("clicked");

				break;
			}

		}


	}

	
	
}
