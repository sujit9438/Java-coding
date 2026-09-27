package StringProgramByMe;

import java.util.Scanner;

public class MostFrequentCharacter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String a=sc.nextLine();
		
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
		}
	}

}
