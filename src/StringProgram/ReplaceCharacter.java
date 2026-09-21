package StringProgram;

import java.util.Scanner;

public class ReplaceCharacter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		System.out.println("Enter which character should be replaced : ");
		char repalce=sc.next().charAt(0);
		System.out.println("Give charcter you shpuld repelce with it");
		char newChar=sc.next().charAt(0);
		a=a.replace(repalce, newChar);
		System.out.println("New String is : "+a);
	}

}
