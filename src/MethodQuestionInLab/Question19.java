package MethodQuestionInLab;

import java.util.Scanner;

public class Question19 {

	public static void main(String[] args) {
		Question19 obj=new Question19();
		System.out.println(obj.getUserAge());
	}
	int getUserAge()
	{
		Scanner sc = new Scanner(System.in);
		int age=sc.nextInt();
		return age;
	}

}
