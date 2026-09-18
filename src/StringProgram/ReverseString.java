package StringProgram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  ");
		String a=sc.nextLine();
		String rev= "";
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println("Reverse of String is: "+rev);
		
	}

}
