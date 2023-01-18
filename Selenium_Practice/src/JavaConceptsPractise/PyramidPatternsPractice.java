package JavaConceptsPractise;

public class PyramidPatternsPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		int K =0;
		int L =0;
		
		for(int i=0;i<4;i++)
		{			
			for(int j=i;j<4;j++) // or int j=1;j<4-i;j++
			{
				
				K++;
				System.out.print(K);
				System.out.print(" ");
			}
			
	
				System.out.println(" ");
		}

	
		
		

	int T = 3;
	for(int i=1;i<=4;i++)
	{
		
		
		for(int j=1;j<=i;j++)
		{
			L++;
			//System.out.print(L*T + "");
			System.out.print(L + "");
			System.out.print(" ");
		
		}
		

			System.out.println("  ");
	}

}

}
