

import java.util.Scanner;

public class Matrix_Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  int n,m,p,q;
		  @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter number of rows and colums of 1st matrix");
		  n=sc.nextInt();
		  m=sc.nextInt();
		  System.out.println("enter number of rows and colums of 2nd matrix");
		  p=sc.nextInt();
		  q=sc.nextInt();
		  if(m==p)
		  {
		  int a[][]=new int[n][m];
		  int b[][]=new int[p][q];
		  int res[][]=new int[n][q];
		   System.out.println("enter matrix 1");
		   		for (int i=0;i<n;i++)
		   		{
		   			for(int j=0;j<m;j++)
		   			{
		   				a[i][j]=sc.nextInt();
		   			}
		   		}
		   		System.out.println("enter matrix 2");
		   		for (int i=0;i<p;i++)
		   		{
		   			for(int j=0;j<q;j++)
		   			{
		   				b[i][j]=sc.nextInt();
		   	   		}
		   			
		   	
				}
		   		for (int i=0;i<n;i++)
		   		{
		   			for(int j=0;j<q;j++)
		   			{
		   				for(int k=0;k<p;k++)
		   				{
		   				res[i][j]+=a[i][k]*b[k][j];
		   	   		}
		   			}
		   	
				}
		   		for (int i=0;i<n;i++)
		   		{
		   			for(int j=0;j<q;j++)
		   			{
		   			  System.out.print(res[i][j]+"\t");
		   	   		}
		   			System.out.println();
		   	
				}
	}}

}
