package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question36 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter element of an Array one by one");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<a.length;i++)
		{
			//Storing the current  value
			int current = a[i];//keeping the value one step forward.
			int j= i-1;
			while(j>=0 && a[j]> current)
			{
				a[j+1]=a[j];
				j--;
			}//to store the current element.
			a[j+1]=current;
		}
		System.out.println(Arrays.toString(a));
		
		
	}

}
