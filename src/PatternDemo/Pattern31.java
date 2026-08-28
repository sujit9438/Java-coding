package PatternDemo;
//pascal tringle
public class Pattern31 {

	public static void main(String[] args) 
	{
		int star=1;
		int space=5;
		for(int i=1;i<=6;i++)
		{
				for(int a=1;a<=space;a++)
				{
					System.out.print(" ");
				}
				int x=1;
				int num=i-1;
				int den=1;
				for(int k=1;k<=star;k++)
				{
					System.out.print(x+" ");
					x=(x*num)/den;
					num--;
					den++;
				}
				space--;
				star++;
				System.out.println();
			
		}
	}

}
