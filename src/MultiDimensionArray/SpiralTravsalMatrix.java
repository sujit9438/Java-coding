package MultiDimensionArray;

import java.util.Scanner;

public class SpiralTravsalMatrix {

	public static void main(String[] args) 
	{
		
		        Scanner sc = new Scanner(System.in);
		        
		        int [][]a=new int[3][3];
		        for(int i=0;i<a.length;i++)
		        {
		            for(int j=0;j<a[i].length;j++)
		            {
		                a[i][j]=sc.nextInt();
		            }
		        }
		        System.out.print("Spiral Order: ");
		        int top=0;
		        int bootom=a.length-1;
		        int left=0;
		        int right=a[0].length-1;
		        while(left<=right && top<=bootom)
		        {
		            for(int i=left;i<=right;i++)
		            {
		                System.out.print(a[top][i]+" ");
		            }
		            top++;
		            for(int i=top;i<=bootom;i++)
		            {
		                System.out.print(a[i][right]+" ");
		            }
		            right--;
		            if(left<right)
		            {
		                for(int j=right;j>=left;j--)
		                {
		                    System.out.print(a[bootom][j]+" ");
		                }
		                bootom--;
		            }
		            if(top<bootom)
		            {
		                for(int j=bootom ;j>=top;j--)
		                {
		                    System.out.print(a[j][left]+" ");
		                }
		                left++;
		            }
		        }
		        

	}

}
