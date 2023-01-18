package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNG_SUVCar {

	
	@Test(groups= {"SelectedCar"})
	public void GetSUV()
	{
		
		System.out.println("Welcome to SUV");
		
	}
	
	@Test
	public void SUVWebLogin()
	{
		
		System.out.println("Welcome to SUV Web Login ");
		
	}
	@Test
	public void SUVMobileLogin()
	{
		
		System.out.println("Welcome to SUV Mobile Login");
		
	}
	
	
	
	
}
