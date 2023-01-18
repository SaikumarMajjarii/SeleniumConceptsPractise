package New_TestNG_Project;

import org.testng.annotations.Test;

public class testNG_HelperAttributes_Priority {


	//Priority happens 
	//--> Negative 
	//--> Non Priority or Zero (Alphabetical)
	
	//--> Same Priority Methods(Aplhabetical)
	//--> Example : 1 has lowest priority Executed at  First  and 2 has Highest priority So Executed at last
	
	@Test(priority =-1)
	public void SendMsg()
	{
		
		
		System.out.println("I will Send Msg ");
	}
	
	@Test
	public void SendEmail()
	{
		
		System.out.println("I will Send Email");
		
	}
	
	@Test(priority =1,enabled= false)
	public void Call()
	{
		
		System.out.println("I will Call ");
		
	}
	@Test
	public void Chat()
	{
		
		System.out.println("I will Chat ");
		
	}
	
	@Test(priority =-2)
	public void Meet()
	{
		
		System.out.println("I will Meet ");
		
	}
}
