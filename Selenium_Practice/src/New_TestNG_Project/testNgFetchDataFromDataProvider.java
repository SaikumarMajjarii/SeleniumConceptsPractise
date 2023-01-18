package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNgFetchDataFromDataProvider {
	
	
	
	
	@Test(dataProvider = "IterateData",dataProviderClass = testNG_DataProvider.class) 
	
	
	public void setData(String name, String rollNo , String School) 
	{ 
	   System.out.println("Name: " +name); 
	   System.out.println("RollNo: " +rollNo); 
	   System.out.println("School: " +School); 
	} 
	

}
