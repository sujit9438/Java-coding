package StringProgram;

import java.util.Scanner;

public class StringRotation {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String :");
		String s=sc.nextLine();
		System.out.println("Enter Second String :");
		String v=sc.nextLine();
		
		if((s+v).contains(v))
		{
			System.out.println("Same String");
		}
		else
		{
			System.out.println("Not same String");
		}
		
	}

}
