package New_TestNG_Project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNG_Test2 {

	
	@Parameters({"Name"}) 
	@Test(priority = 1) 
	public void stName(String n) 
	{ 
	  System.out.println("Student's name: " +n); 
	} 
	
	
	@Parameters({"School"}) 
	@Test
	public void scName(String sc) 
	{ 
		
		
		
		
	  System.out.println("School's name: " +sc); 
	} 
	
	
}

