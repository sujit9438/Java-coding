package StringProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ToggleCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a=sc.nextLine();
		a= a.toUpperCase();
		String [] b =a.split(" ");
		String result="";
		
		for(int i=0 ;i<b.length;i++)
		{
			result+=(char)(b[i].charAt(0)+32)+b[i].substring(1)+" ";
		}
		System.out.println("Result : "+result);
		
	}

}
