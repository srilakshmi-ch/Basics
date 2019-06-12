

import java.util.Scanner;

public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		double area;
		float d1,d2;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter daignal1 of d1 value");
	   d1=sc.nextFloat();
	   System.out.println("enter daignal2 of d2 value");
	   d2=sc.nextFloat();
	   area=d1*d2;
	   System.out.println("area of rhombus"
	   		+ " is"+area);;
	}

}
