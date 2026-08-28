package PatternDemo;

public class Pattern29 {

	public static void main(String[] args) 
	{
		int space=8;
				int star=1;
			for(int i=1;i<=9;i++)
			{
				for(int j=1;j<=star;j++)
				{
					System.out.print(" * ");
				}
				for(int k=1;k<=space;k++)
				{
					System.out.print("   ");
				}
				for(int a=1;a<=star;a++)
				{
					System.out.print(" * ");
				}
				if(i<=4)
				{
					space-=2;
					star++;
				}
				else {
					space+=2;
					star--;
				}
				System.out.println();
			}

	}

}
