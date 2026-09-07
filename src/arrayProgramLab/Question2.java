package arrayProgramLab;

import java.util.Scanner;

class Question2 {

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
		int max=a[0];
		int min=a[0];
		for(int num:a)
		{
			if(num>max)
			{
				max=num;
			}
			else if(num<min)
			{
				min=num;
			}
			
		}
		System.out.println("Difference in between :"+(max-min));
	}

}
