

import java.util.Scanner;

public class Gcd_Of_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
   @SuppressWarnings("resource")
Scanner sc= new Scanner(System.in);
   System.out.println("enter 2 numbers");
    x=sc.nextInt();
    y=sc.nextInt();		
    	while(x!=y)
    	{
    		if(x<y)
    			y=y-x;
    		if(y<x)
    			x=x-y;
    			
    	}
    	System.out.println("gcd of 2 numbers is "+x);
    }
	

}
