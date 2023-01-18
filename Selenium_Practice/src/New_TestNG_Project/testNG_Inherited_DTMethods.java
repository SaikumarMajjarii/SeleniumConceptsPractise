package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNG_Inherited_DTMethods extends testNG_SuperClass {

//	@Test(dependsOnMethods = { "OpenBrowser" })
//
//	public void LogOut() {
//		System.out.println("The user logged out successfully");
//	}
//
//	@Test
//	public void ShutDown() {
//		System.out.println("The user ShutDown  successfully");
//
//	}
	
	
	@Test(dependsOnMethods = { "testOne" })
	public void testThree() {
		System.out.println("Test three method in Inherited test");
	}

	@Test
	public void testFour() {
		System.out.println("Test four method in Inherited test");
	}
}
