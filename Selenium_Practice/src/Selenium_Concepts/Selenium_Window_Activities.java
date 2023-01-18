package Selenium_Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Window_Activities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();

		Driver.get("https:www.google.com");

		Driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");

		Driver.navigate().to("https:www.google.com");
		Driver.manage().window().maximize();
		Driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		Driver.navigate().back();
		Driver.navigate().forward();

		int Date = 23;
		int Date2 = 23;

		if (Date >= Date2) {
			System.out.println("Greater");

		}
	}

}
