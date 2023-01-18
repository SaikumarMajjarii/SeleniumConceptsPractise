package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNG_SuperClass {

//	
//	 @Test
//	  public void OpenBrowser() {
//		  System.out.println("This will execute first (Open Browser)");
//	  }
//	 
	
	@Test(dependsOnMethods = { "testTwo" })
	public void testOne() {
		System.out.println("Test method one");
	}

	@Test
	public void testTwo() {
		System.out.println("Test method two");
	}
	 
}
