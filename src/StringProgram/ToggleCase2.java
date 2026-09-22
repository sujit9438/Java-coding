package StringProgram;

import java.util.Scanner;

public class ToggleCase2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a=sc.nextLine();
		
		
		String result="";
		 
		 for(int i=0;i<a.length();i++)
		 {
			 char ch =a.charAt(i);
			 if(ch>='A' && ch<='Z')
			 {
				 ch=(char)(ch+32);
			 }
			 else if(ch>='a' && ch<='z')
			 {
				 ch=(char)(ch-32);
			 }
			 result+=ch;
		 }
		 System.out.println("Result is : "+result);
	}

}
