package StringProgramByMe;

import java.util.Scanner;

public class CountFrequencyOfGivenString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  A String ");
		String a= sc.nextLine();
		System.out.println("Enter A character ");
		char ch=sc.next().charAt(0);
		
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+" = "+count);
	}

}
