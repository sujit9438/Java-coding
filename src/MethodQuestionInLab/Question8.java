package MethodQuestionInLab;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) 
	{
		System.out.println(calculateSum());
	}
	public static int calculateSum()
	{
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		return a+b;
	}

}
