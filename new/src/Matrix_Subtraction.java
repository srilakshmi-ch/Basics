

import java.util.Scanner;

public class Matrix_Subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int n,m;
		  @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter number of rows and colums");
		  n=sc.nextInt();
		  m=sc.nextInt();
		  int a[][]=new int[n][m];
		  int b[][]=new int[n][m];
		  int res[][]=new int[n][m];
		   System.out.println("enter matrix 1");
		   		for (int i=0;i<n;i++)
		   		{
		   			for(int j=0;j<m;j++)
		   			{
		   				a[i][j]=sc.nextInt();
		   			}
		   		}
		   		System.out.println("enter matrix 2");
		   		for (int i=0;i<n;i++)
		   		{
		   			for(int j=0;j<m;j++)
		   			{
		   				b[i][j]=sc.nextInt();
		   	   		}
		   			
		   	
				}
		   		for (int i=0;i<n;i++)
		   		{
		   			for(int j=0;j<m;j++)
		   			{
		   				res[i][j]=a[i][j]-b[i][j];
		   	   		}
		   			
		   	
				}
		   		for (int i=0;i<n;i++)
		   		{
		   			for(int j=0;j<m;j++)
		   			{
		   			  System.out.print(res[i][j]+"\t");
		   	   		}
		   			System.out.println();
		   	
				}
	}

}
