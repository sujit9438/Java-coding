package StringProgram;

import java.util.Scanner;

public class ConcatenateString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		System.out.println("Enter a String");
		String b=sc.nextLine();
		System.out.println(a.concat(b)); // a+b
	}

}
