import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Selenium_Launch_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// is used to Set webdriver.chrome.driver at Global Level and Sekenium checks for that Key word and Invokes Chrome Driver and Chrome Driver performs Actions 
		//on the Actual Browser 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		
		//Edge Driver
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\msedgedriver.exe");
		
		//Chrome Driver 
		WebDriver Driver = new ChromeDriver();
		
		
		//Edge Driver
		WebDriver edgeDriver = new EdgeDriver();
		
		
		
		//to Load any URL 
		Driver.get("https://www.google.com");

		
		//TO get Title	
		System.out.println(Driver.getTitle());
		
		//TO get Current URL
		System.out.println(Driver.getCurrentUrl());
		
		//To Close Current Window
		Driver.close();
		
		//TO Close Everything
		Driver.quit();
		
		
	}

}
