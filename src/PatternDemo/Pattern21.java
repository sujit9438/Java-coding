package PatternDemo;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=5;j++)
			{
				if(i<=j) {
					
				
				System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}
