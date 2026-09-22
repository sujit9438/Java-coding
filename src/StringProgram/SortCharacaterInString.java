package StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacaterInString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		String a=sc.nextLine();
		
		char [] s=a.toCharArray();
		Arrays.sort(s);
		a=String.valueOf(s);
		System.out.println(a);
		
	}

}
