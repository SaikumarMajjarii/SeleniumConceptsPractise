package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNG_sportsCar {

	
	
	@Test(groups= {"SelectedCar"})
	public void GetDataSportsCar() {
		
		
		System.out.println("Good Mrng Sport Cars");
	}
	
	@Test
	public void GetDataSportCarSpeed() {
		
		
		System.out.println("Sport Cars Speed is 100 ");
	}
	
}
