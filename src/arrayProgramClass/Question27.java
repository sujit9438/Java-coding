package arrayProgramClass;

import java.util.Arrays;
import java.util.Scanner;

public class Question27 {

	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter size");
		int size= ob.nextInt();
		int [] a= new int[size];
		
		System.out.println("Enter values ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=ob.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(previouslyPresent(a, i)==false)
			{
				count++;
			}
		}
		int [] b=new int [count];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(previouslyPresent(a, i)==false)
			{
				b[index]=a[i];
				index++;
			}
		}
		System.out.println("Result : "+Arrays.toString(b));
		
	}
	public static boolean previouslyPresent(int [] a,int i)
	{	
		boolean result=false;
		for(int j=0;j<=i-1;j++)
		{
			if(a[j]==a[i])
			{
				result=true;
				break;
			}
		}
		return result;
	}

}
