package StringProgramByMe;

import java.util.Scanner;

public class FirstNonRepectingCharacters {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++)
		{
			int count=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println("First Non repeating Character is : "+a.charAt(i));
				break;
			}
		}
	}

}
