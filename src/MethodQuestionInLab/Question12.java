package MethodQuestionInLab;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		displayEvenNumber();
	}
	public static void displayEvenNumber()
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
