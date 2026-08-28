package methodLabQuestion;

public class Question5 
{
	public static void main(String[] args) {
		printPattern();
	}
	public static void printPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
