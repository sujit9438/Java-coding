package arrayProgramLab;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int [] a= new int[size];
		System.out.println("Enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean sorted=true;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i] > a[i+1])
			{
				sorted=false;
				break;
			}
		}
		System.out.println(sorted);
		
	}

}
