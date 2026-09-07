package arrayProgramClass;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter element to search  ");
		int n=sc.nextInt();
		int count=0;
		for(int e :a)
		{
			if(e==n)
			{
				count++;
			}
		}
		System.out.println(n+" apperad "+count+" times");
	}

}
