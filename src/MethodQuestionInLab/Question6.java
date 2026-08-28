package MethodQuestionInLab;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		printSquare(n);
	}
	public static void printSquare(int n)
	{
		int s=(int)Math.pow(n,2);
		System.out.println(s);
	}

}
