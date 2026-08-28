package MethodQuestionInLab;

import java.util.Scanner;



public class Question9 {

	public static void main(String[] args) {
		System.out.println(isPositive());
	}
	public static boolean isPositive()
	{
		Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			if(a>0)
			{
				return true;
			}
			else
			{
				return false;
			}
	}

}
