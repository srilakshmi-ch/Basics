

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter n1 and n2 ");
	   int n1,n2,temp;
	   n1=sc.nextInt();
	   n2=sc.nextInt();
	 	while (n2 > 0)
	   	{
	   	     temp = n2;
	   	     n2 = n1% n2; 
	   	     n1 = temp;
	   	}
	 	System.out.println("hcf of 2 numbers="+n1);
	}

}
