

import java.util.Scanner;

public class IsoscelesTraingleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		double area;
		float b,a;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter width a value");
	   a=sc.nextFloat();
	   System.out.println("enter heigh b of value");
	   b=sc.nextFloat();
	   area=(b/4)*Math.sqrt(((4*a*a)-(b*b)));
	   System.out.println("area of isosceles triangle"+area);
	}

}
