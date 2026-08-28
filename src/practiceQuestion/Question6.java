package practiceQuestion;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int digit=0;
		while(a!=0)
		{
			int ld=a%10;
			digit=digit*10+ld;
			a/=10;
		}
		System.out.println(digit);
	}

}
