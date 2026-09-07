package arrayProgramClass;

import java.util.Arrays; 
import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int [] b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[(a.length-1)-i];
		}
		System.out.println("Result = "+Arrays.toString(b));
	}

}
