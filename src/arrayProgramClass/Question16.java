package arrayProgramClass;

import java.util.Scanner;
//difference between largest and smallest.
public class Question16 {

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
		int largest=a[0];
		int smallest=a[0];
		for(int num:a)
		{
			if(num>largest)
			{
				largest=num;
			}
			else if(num<smallest)
			{
				smallest=num;
			}
			
		}
		System.out.println("Difference in between :"+(largest-smallest));
	}

}
