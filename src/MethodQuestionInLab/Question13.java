package MethodQuestionInLab;

import java.util.Scanner;

public class Question13 {

	public static void main(String[] args) {
		
		Question13 obj=new Question13();
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(obj.multiply(a,b));
	}
	public int multiply(int a, int b)
	{
		return a*b;
	}

}
