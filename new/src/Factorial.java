

import java.util.Scanner;

public class Factorial {
	static int fact(int a)
	{    int f=1;
		for(int i=1;i<=a;i++)
		{
			f=f*i;
			
		}
	return f;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
	int r=sc.nextInt();
	System.out.println("factorial of"+r+"= "+fact(r));
	}

}
