

import java.util.Scanner;

public class Gpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5,i,sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int m[]=new int[n];
		int g[]=new int[n];
		System.out.println("enter marks of each subject");
		for(i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			g[i]=m[i]/10;
		}
		for(i=0;i<n;i++)
		{
			sum=sum+g[i];
		}
		double cgpa=sum/n;
		System.out.println("central gpa="+cgpa);
		System.out.println("central percentage="+cgpa*9.5);
		
	}

}
