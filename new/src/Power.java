

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int x,y,sum=1;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x y values");
		x=sc.nextInt();
		y=sc.nextInt();
		for(int i=1;i<=y;i++)
	
	{
		sum=sum*x;
	}
	System.out.println(x+"x to the power of"+y+"is="+sum);
		
	}
}
