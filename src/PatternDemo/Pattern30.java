package PatternDemo;

public class Pattern30 {

	public static void main(String[] args) 
	{
		int space=4;
		int starSpace=1;
		for(int i=1;i<=5 ;i++)
			
		{
			for(int a=1;a<=space;a++)
			{
				System.out.print(" ");
			}
			for(int b=1;b<=starSpace;b++)
			{
				System.out.print("* ");
			}
			space--;
			starSpace++;
			System.out.println();
		}
	}

}
