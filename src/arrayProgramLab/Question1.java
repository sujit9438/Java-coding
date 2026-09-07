package arrayProgramLab;

import java.util.Scanner;
//find average in array.
public class Question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println(" Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int num : a)
		{
			sum+=num;
		}
		double avg=(double)sum/a.length;
		System.out.println(avg);
	}

}
