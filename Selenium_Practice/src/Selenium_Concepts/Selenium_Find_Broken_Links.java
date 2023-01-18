package Selenium_Concepts;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Find_Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException {


		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		
		List<WebElement> AllLinks = driver.findElements(By.xpath("//*[@class='gf-t']/tbody/tr/td/ul/li/a"));
		

		for(WebElement Link : AllLinks)
		{
			
			String EachLink = Link.getAttribute("href");
			
			
			HttpURLConnection Conn = (HttpURLConnection) (new URL(EachLink).openConnection());
			
			Conn.setRequestMethod("HEAD");
			Conn.connect();
			
			int ResCode = Conn.getResponseCode();
			
			if(ResCode>=400)
			{
				System.out.println(Link.getText()+" : Broken with Status Code "+ ResCode);
				
			}
			
		}
		
	}
	

}
