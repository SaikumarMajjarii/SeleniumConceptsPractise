package New_TestNG_Project;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestthroughTestNGXML {
	
	
	@Parameters({"Name"}) 
	@Test(priority = 1) 
	public void stName(String n) 
	{ 
	  System.out.println("Student's name: " +n); 
	} 
	
	
	
	@Parameters({"School"}) 
	@Test(priority = 2) 
	
	public void scName(String sc) 
	{ 
	  System.out.println("School's name: " +sc); 
	} 
	// This test method will take two parameters as input. 
	// The value of test parameter is defined at the test level. The suite level parameter is overridden at test level. 

	@Parameters({"STD", "RollNo"}) 
	@Test(priority = 3) 
	public void rollSTD(String s, String r) 
	{ 
	   System.out.println("STD: " +s); 
	   System.out.println("Roll No: " +r); 
	  } 
	
	
	
	
	

}
