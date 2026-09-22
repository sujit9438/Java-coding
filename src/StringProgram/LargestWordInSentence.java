package StringProgram;

import java.util.Scanner;

import ArrayProByMe.MazimumSubArraySum;

public class LargestWordInSentence {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s=sc.nextLine();
		
		String [] a=s.split(" ");
		int maxLength=0;
		
		for(String e:a)
		{
			if(e.length()>maxLength)
			{
				maxLength=e.length();
			}
		}
		for(String e:a)
		{
			if(e.length()==maxLength)
			{
				System.out.println("Sentence is : "+e);
				System.out.println("Maximum Length of Sentence is : "+maxLength);
			}
		}
		
	}

}
