package StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramString {

	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String a= sc.nextLine();
		System.out.println("Enter Second String");
		String b=sc.nextLine();
		
		char[] c=a.toCharArray();
		char []d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
	}

}
