package StringProgram;

import java.util.Scanner;

public class CheckSubStringExitOrNot {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		System.out.println("Enter the Substring : ");
		String sub=sc.nextLine();
		if(a.contains(sub))
		{
			System.out.println(" Substring ");
		}
		else
		{
			System.out.println(" Not substring ");
		}
	}

}
