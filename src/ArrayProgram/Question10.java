package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int x=0;
		int y=a.length-1;
		while(x<y)
		{
			int temp=a[x];
			a[x]=a[y];
			a[y]=temp;
			x++;
			y--;
			
		}
		System.out.println("Results is : "+Arrays.toString(a));
	}

}
