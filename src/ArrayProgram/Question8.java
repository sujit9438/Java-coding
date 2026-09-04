package ArrayProgram;

import java.util.Scanner;

public class Question8 {

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
				System.out.println("Enter n value ");
				int n=sc.nextInt();
				
				for(int i = 0;i<a.length;i++)
				{
					int count=0;
					for(int j=0;j<a.length;j++)
					{
						if(a[j]<a[i])
						{
							count++;
						}
						
					}
					if(count==(n-1));
					{
						System.out.println("Result : "+a[i]);
						break;
					}
					
				}
					
					
			}


}
