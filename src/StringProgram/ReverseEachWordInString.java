package StringProgram;

import java.util.Scanner;

public class ReverseEachWordInString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a= sc.nextLine();
		
		String [] b=a.split(" ");
		String result="";
		
		for( int i=0;i<b.length;i++)
		{
			String rev="";
			for(int j= b[i].length()-1;j>=0;j--)
			{
				rev=rev+b[i].charAt(j);
			}
			result=result+rev+" ";
			//first way:-1
//			if(i==b.length-1)
//			{
//				result=result+rev;
//			}
//			else
//			{
//				result=result+rev+" ";
//			}
		}
//		System.out.println(result);
		System.out.println(result.trim());


	}

}
