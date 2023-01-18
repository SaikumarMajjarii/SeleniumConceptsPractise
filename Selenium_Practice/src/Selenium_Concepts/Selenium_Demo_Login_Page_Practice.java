import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Selenium_Demo_Login_Page_Practice {

	public static void main(String[] args) throws InterruptedException {

		String name = "Sai Kumar";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saiku\\Downloads\\Automation_Selenium_Journey\\SeleniumDriver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();

		Driver.get("https://rahulshettyacademy.com/locatorspractice/");

		// Implicit Wait
		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		Driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);

		Driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String Pass = GetPassword(Driver);

		Driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		Thread.sleep(2000);
		Driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		Driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(Pass);

		Driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

		Thread.sleep(2000);
		Assert.assertEquals(Driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");

		Assert.assertEquals(Driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),
				"Hello " + name + ",");

		Driver.findElement(By.xpath("//*[text()='Log Out']")).click();

		Driver.close();

	}

	public static String GetPassword(WebDriver Driver) {
		String PassText = Driver.findElement(By.cssSelector("form p")).getText();
		String[] Passwords = PassText.split("'");

		String[] Password2 = Passwords[1].split("'");

		String OrginalPass = Password2[0];

		return OrginalPass;

	}

}
