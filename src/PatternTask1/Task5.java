package PatternTask1;

public class Task5 {

	public static void main(String[] args) {
		int temp=0;
		for(int i=1;i<=4;i++)
		{
			temp=i;
			
			for(int j=1;j<=5;j++)
				
			{
				
				System.out.print(" "+temp+" ");
				temp=temp+i;
				
			}
			System.out.println();
		}

	}

}
