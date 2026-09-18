package StringProgram;

import java.util.Scanner;

public class CountOccurenceOfCharacter 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  ");
		String a=sc.nextLine();
		System.out.println("Enter character ");
		char ch=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("Given char count "+count);
	}
}
