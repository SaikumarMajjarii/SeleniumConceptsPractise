package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNG_PremiumCars {

	
	
	@Test
	public void GetPremiumCar()
	{
		
		
		System.out.println("Hi this is Premium Car");
	}
	
	@Test(groups= {"SelectedCar"})
	public void SendPremiumCar()
	{
		
		
		System.out.println("Send the  Premium Car");
	}
}

