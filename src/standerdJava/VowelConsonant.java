package standerdJava;

import java.util.Scanner;

public class VowelConsonant {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a character");
	char ch =sc.next().charAt(0);
	if(ch=='A'||ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' || ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' )
	{
		System.out.println("Character is Vowel");
	}
	else
	{
		System.out.println("Character is Consonant");
	}
}
}
