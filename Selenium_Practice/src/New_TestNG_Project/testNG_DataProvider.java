package New_TestNG_Project;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testNG_DataProvider {
	
	
	
	
	
	@Test(dataProvider = "IterateData") 
	public void setData(String name, String rollNo , String School) 
	{ 
	   System.out.println("Name: " +name); 
	   System.out.println("RollNo: " +rollNo); 
	   System.out.println("School: " +School); 
	} 
	
	@Test(dataProvider = "getData") 
	public void setData2(String name, String rollNo , String School) 
	{ 
		
		
		System.out.println("_______________________________________");
	   System.out.println("Name: " +name); 
	   System.out.println("RollNo: " +rollNo); 
	   System.out.println("School: " +School); 
	} 
	
	@DataProvider(name = "IterateData")
	public Object[][] GetData()
	{
		
		Object[][] Input_Data = new Object[2][3];
		
		// 1st row. 
		Input_Data[0][0] = "John"; 
		Input_Data[0][1] = "23"; 
		Input_Data[0][2] = "Nehru";
	// 2nd row. 
		Input_Data[1][0] = "Siddu"; 
		Input_Data[1][1] = "24"; 
		Input_Data[1][2] = "Swami";
	
	      return Input_Data; 
		
		
	}
	
	
	// Here, we are not declaring attribute "name" for DataProvider. So, it will use the name of method or function. 
	@DataProvider public Object[ ][ ] getData() 
	{ 
	// You can also return data in this way. Here, we are using an anonymous concept of Java to return data. 
	   return new Object[ ][ ] { 
	           {"DEEPAK"," 1234","SAI"}, 
	           {"AMIT","12345","PRIYA"}
	          
	    }; 
	   } 

}
