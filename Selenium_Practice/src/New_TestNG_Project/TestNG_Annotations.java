package New_TestNG_Project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations {
	
	
	
	
		@BeforeMethod
		public void beforeMethod() {
		System.out.println(" Before Method will execute before every test method");
		}
		 
	
	 
		@AfterMethod
		public void afterMethod() {
		System.out.println("After Method will execute after every test method ");
		}
		 
		@BeforeClass
		public void beforeClass() {
		System.out.println("Before Class will always execute prior to Before Method and Test Method ");
		}
		 
		@AfterClass
		public void afterClass() {
		System.out.println("After Class will always execute later to After Method and Test method");
		}
		 
		@BeforeTest
		public void beforeTest() {
		System.out.println("Before Test will always execute prior to Before Class, ,Before Method and Test Method ");
		}
		 
	
		@AfterTest
		public void afterTest() {
		System.out.println("After Test will always execute later to After Method, After Class ");
		}
		
		
		@BeforeSuite
		public void beforeSuite() {
		System.out.println("Before Suite will always execute prior to all annotations or tests in the suite.");
		}
		 
		@AfterSuite
		public void afterSuite() {
		System.out.println("After suite will always execute at last when all the annotations or test in the suite have run.");
		}
		 
		@Test
		public void testCase1() {
		System.out.println("This is my First Test Case 1");
		}
		 
		@Test
		public void testCase2() {
		System.out.println("This is my Second Test Case 2");
		}
		 
		

}
