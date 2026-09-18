package StringProgram;

import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
			System.out.println(a.charAt(i));
		}

	}

}
