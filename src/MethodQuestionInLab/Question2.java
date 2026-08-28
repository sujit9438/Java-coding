package MethodQuestionInLab;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		double r=sc.nextDouble();
		System.out.println(findArea(r));
	}
	public static double findArea(double r)
	{
		return 3.14*(r*r);
	}

}
