package PatternTask1;

public class Task11 {

	public static void main(String[] args) 
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int x=n+1-i;
			for(int j=5;j>=1;j--)
			{
				if(i<=j)
				{
					
					System.out.print(x+" ");
					x--;
					
				}
				
			}
			
			System.out.println();
		}
	}

}
