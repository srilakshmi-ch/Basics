

import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=3,m=3;
   int a[][]=new int[m][n];
   @SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
   System.out.println("enter matrix");
   		for (int i=0;i<n;i++)
   		{
   			for(int j=0;j<n;j++)
   			{
   				a[i][j]=sc.nextInt();
   			}
   		}
   		System.out.println("Matrix Transpose");
   		for (int i=0;i<n;i++)
   		{
   			for(int j=0;j<n;j++)
   			{
   				System.out.print(a[j][i]+"\t");
   	   		}
   			
   		System.out.println();
		}
   		}
   		
		
	}


