package Selenium_Concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("https://rahulshettyacademy.com/locatorspractice/");

		
		//Implicit Wait
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//By ID 
		Driver.findElement(By.id("inputUsername")).sendKeys("SaiKumar");
		
		//By Name 
		Driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");

		//By Class Name 
		Driver.findElement(By.className("signInBtn")).click();

		
		//CSS Selector 
		String ErrorMsg  = Driver.findElement(By.cssSelector("p.error")).getText();
		
		System.out.println(ErrorMsg);
		
		//By Link Text
		Driver.findElement(By.linkText("Forgot your password?")).click();
			
		//Xpath  : = //TagName[@attribute = 'Value']
		//By Xpath in Console $x('//input[@placeholder="Name"]') for Xpath	
		Driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sai");
				
		//Customized CSS Path TagName[Attribute ='Value']
		Driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("Saikumar@kumar.com");
		
		
		//Multiple Elements are Matching in Xpath then we right 
		// (//TagName[@Attriubute ='Value'][index]
		//Xpath to Find Webelement when we have Multiple Elements with index 
		
		Driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		//Multiple Elements are Matching in CSS Selector  Should be Last Option of Identification
		Driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Saikumar@gmail.com");
	
		//Parent  to Child Traverse Xpath  and with CSS : = form input:nth-child(5)
		Driver.findElement(By.xpath("//form/input[3]")).sendKeys("9382800000");

		
		//Css Locator using .Classname
		Driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		
		
		//Css locator using generic Syntax  : - form input:nth-child(5)
		System.out.println(Driver.findElement(By.cssSelector("form p")).getText());
		
		Driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		
		Thread.sleep(1000);
		
		//Sign in Process
		Driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Saikumar");
		
		//Regular Expression CSS Selector  : =Tagname[attribute*='Value']
		
		Driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		
		
		
		//div[@class='forgot-pwd-btn-conainer']/button[1] CUstomized,Index,Parent to Child COmbination Locator
		
		//Tagname[@attribute='value']/Child[index]

		//Tagname[@attribute='value']/Child[index]
		Driver.findElement(By.xpath("//div[@class='checkbox-container']/span[1]")).click();
		
		//Driver.findElement(By.name("chkboxTwo"));
		
		Thread.sleep(1000);

		//Regular Expression XPath : = //Tagname[contains(@Attrtibute,'Value')];
		Driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		Thread.sleep(2000);
		
		//Xpath Based on Text //Tagname[text()='Value'] or //*[text()='Value']
		Driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		
		
		
		//parent to child traverse
		
		Driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		
		
	}

}
