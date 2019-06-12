

import java.util.Scanner;

public class Ncr_Npr {

	static int fact(int a)
	{    int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
			
		}
	return f;
	}
	static void npr(int n,int r)
	{
		float res=fact(n)/(fact(n-r));
		System.out.println("Npr value is"+res);
	}
	static void ncr(int n,int r)
	{
		float res=fact(n)/(fact(n-r)*fact(r));
		System.out.println("Ncr value is"+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r;
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		   System.out.println("enter n value");
		    n=sc.nextInt();
		    System.out.println("enter r value");
		    r=sc.nextInt();	
		    npr(n,r);
		    ncr(n,r);
		
	}

}
