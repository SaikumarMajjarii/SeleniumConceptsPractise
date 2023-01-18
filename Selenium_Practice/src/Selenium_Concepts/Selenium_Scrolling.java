import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new ChromeDriver();
		
		Driver.manage().window().maximize();
		
		Driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		JavascriptExecutor JS = (JavascriptExecutor) Driver;
		
		
		//Scroll to Middle as of now on Present WebPage
		JS.executeScript("window.scrollBy(0,500)","");
		
		//Scroll to End 
		JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		//Scroll up to Element 
		WebElement Join = Driver.findElement(By.xpath("//tbody/tr/td[4]/ul/li[1]"));
		JS.executeScript("arguments[0].scrollIntoView()", Join);
		
		
		//Scroll to UP Again
		Thread.sleep(2000);
		JS.executeScript("window.scrollTo(0, -document.body.scrollHeight)");
		
		//OR
		JS.executeScript("window.scrollTo(0,document.body.scrollTop)");
		
		//to Scroll in Table
		JS.executeScript("document.querySelector('.tableFixHead').scrollTop =5000");
		
	}

}




//1.To scroll page to the bottom use window.scrollTo(0,document.body.scrollHeight) as parameter
//
////Code to navigate to bottom
//
//WebDriver driver = new ChromeDriver();
//JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
//jsExecuter.executeScript(window.scrollTo(0,document.body.scrollHeight));
//2.To scroll page to the top use window.scrollTo(0,document.body.scrollTop) as parameter
//
////Code to navigate to top
//
//WebDriver driver = new ChromeDriver();
//JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
//jsExecuter.executeScript(window.scrollTo(0,document.body.scrollTop));
//3.To scroll page to the Left use window.scrollTo(0,document.body.scrollLeft) as parameter
//
////Code to navigate to left
//
//WebDriver driver = new ChromeDriver();
//JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
//jsExecuter.executeScript(window.scrollTo(0,document.body.scrollLeft));
//4.To scroll to certain point window.scrollTo(0,500) as parameter
//
////Code to navigate to certain point e.g. 500 is passed as value here
//
//WebDriver driver = new ChromeDriver();
//JavascriptExecutor jsExecuter = (JavascriptExecutor)driver;
//jsExecuter.executeScript(window.scrollTo(0,500));
















