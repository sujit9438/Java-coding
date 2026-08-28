package ForloopProgram;

import java.util.Scanner;

public class CountOfFcator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		
		for (int i=1 ;i<=n;i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		System.out.println(count);

	}

}
