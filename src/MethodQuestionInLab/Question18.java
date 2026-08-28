package MethodQuestionInLab;

import java.util.Scanner;

public class Question18 {

	public static void main(String[] args) {
		Question18 obj=new Question18();
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		obj.displayResult(a);
	}
	void displayResult(int marks)
	{
		if(marks>=35)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
