package StringProgram;

import java.util.Scanner;

public class CompareTwoString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		System.out.println("Enter a String");
		String b=sc.nextLine();
		
		if(a.equals(b)) //if(a.equalsIgnoreCase(s2)) :- this for case sensitive.
		{
			System.out.println("String are Equal");
		}
		else
		System.out.println("String are not equal");
	}

}
