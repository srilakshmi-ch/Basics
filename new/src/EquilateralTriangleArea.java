

import java.util.Scanner;

public class EquilateralTriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		float a;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter side of a value");
	   a=sc.nextFloat();
	   area=(Math.sqrt(3)/4)*(a*a);
	   System.out.println("area of equilateralTraingle is"+area);
	}

}
