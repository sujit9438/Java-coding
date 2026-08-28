package practiceQuestion;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			int count=0;
			for(int j=2;j<=9;j++)
			{
				if(i%j==0)
				{
					count++;
					
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
