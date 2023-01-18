import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_Handling_SSl_Cerifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions Options = new ChromeOptions();
		

		Options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(Options);

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		
		
		
	}

}
