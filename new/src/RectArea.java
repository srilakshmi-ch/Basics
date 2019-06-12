

import java.util.Scanner;

public class RectArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		float l,b;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter lenth of l value");
	   l=sc.nextFloat();
	   System.out.println("enter breadth of b value");
	   b=sc.nextFloat();
	   area=l*b;
	   System.out.println("area of rectangle is"+area);;
	}

}
