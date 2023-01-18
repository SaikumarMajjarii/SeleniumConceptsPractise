package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNG_DependsOnMethod_Attribute  {
	
	
	
	
	//Single  Dependent Tests In TestNG
	@Test(dependsOnMethods = { "OpenBrowser" })
	  public void SignIn() {
		  System.out.println("This will execute second (SignIn)");
	  }
	  
	  

	  @Test
	  public void OpenBrowser() {
		  System.out.println("This will execute first (Open Browser)");
	  }

	  

	  @Test (dependsOnMethods = { "SignIn" })
	  public void LogOut() {
		  System.out.println("The user logged out successfully");
	  }
	  
	  
	  //Multiple Dependent Tests In TestNG
	  @Test(dependsOnMethods = { "SignIn", "OpenBrowser" })
	  public void ShutDown() {
		  System.out.println("The user ShutDown  successfully");
	  }
}

