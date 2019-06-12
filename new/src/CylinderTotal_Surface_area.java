

import java.util.Scanner;

public class CylinderTotal_Surface_area {
  public static double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius of r value");
	float r=s.nextFloat();
		System.out.println("enter heigh of h value");
	float h=s.nextFloat();
	double area=(2*pi*r*r)+(2*pi*r*h);
	System.out.println("total surface area of cylinder="+area);
	}

}
