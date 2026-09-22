package StringProgram;

import java.util.Scanner;

public class CheckEmptyStringOrNot {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		
		if(a.isEmpty())
		{
			System.out.println("Given String is Empty");
		}
		else
		{
			System.out.println("Given String Is Not Empty");
		}
	}

}
