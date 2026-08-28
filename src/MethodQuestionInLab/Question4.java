package MethodQuestionInLab;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		printTable(n);
	}
	public static void printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			int multi=n*i;
			System.out.println(multi);
		}
	}

}
