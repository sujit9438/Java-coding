package practiceQuestion;

import java.util.Scanner;

public class Question7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int temp=a;
		int rev=0;
		while(temp!=0)
		{
			int ld=temp%10;
			rev= rev*10+ld;
			temp/=10;
		}
		if(rev==a)
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
	}
}
