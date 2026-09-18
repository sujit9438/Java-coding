package StringProgram;

import java.util.Scanner;

public class CountVowelsAndConsonants 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String  ");
		String a=sc.nextLine();
		int vCount=0;
		int cCount=0;
		for(int i=0;i<a.length();i++)
		{
			char ch=a.charAt(i);
			if(ch =='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' ||ch =='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' )
			{
				vCount++;
			}
			else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') )
			{
				cCount++;
			}
		}
		System.out.println("Vowel count : "+vCount);
		System.out.println("Consonants count : "+cCount);
	}

}
