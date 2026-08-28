package PatternDemo;

public class Pattern24 {

	public static void main(String[] args) 
	{
		 int star=9;
		 int space=0;
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print("   ");
			 }
			 for(int k=1;k<=star;k++)
			 {
				 System.out.print(" * ");
			 }
			 space++;
			 star-=2;
			 System.out.println();
		 }
				 
	}

}
