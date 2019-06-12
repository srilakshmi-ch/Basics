

import java.util.Scanner;
public class cylinderVolume {
   static double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter radius of r value");
	float r=s.nextFloat();
		System.out.println("enter heigh of h value");
	float h=s.nextFloat();
	double volume=pi*r*r*h;
		
		System.out.println("volume of prism"+volume);
	}

}
