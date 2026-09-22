package StringProgram;

import java.util.Scanner;

public class PrintASCIIValue {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a=sc.nextLine();
	
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			System.out.println(ch+" = "+(int)ch);
		}
	}

}
