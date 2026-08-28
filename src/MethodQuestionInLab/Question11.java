package MethodQuestionInLab;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		printStars();
	}
	public static void printStars()
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			System.out.print(" *");
		}
	}

}
