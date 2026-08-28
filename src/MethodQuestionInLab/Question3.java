package MethodQuestionInLab;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(checkGreater(a,b));
	}
	public static int checkGreater(int a,int b)
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}

}
