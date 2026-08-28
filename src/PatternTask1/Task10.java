package PatternTask1;

public class Task10 {

	public static void main(String[] args) 
	{
		int x=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i>j) 
				{
					System.out.print(x+"\t");
					x+=2;
				}
				
			}
			System.out.println();
		}
	}

}
