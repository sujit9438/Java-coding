package ArrayProByMe;

import java.util.Scanner;

public class ContainsDuplicateOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		
		int [] a= new int[size];
		System.out.println("Enter Array Element One by One");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
	
		}
		boolean duplicate=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					duplicate=true;
					break;
				}
			}
			if(duplicate)
			{
				System.out.println("Array elements contains duplicate");
				break;
			}
			else
			{
				System.out.println("Array elements not contents any duplicate");
				break;
			}
		}
	}

}
