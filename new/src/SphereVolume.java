

import java.util.Scanner;

public class SphereVolume {
  static double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
     System.out.println("enter radius of r value");
     float r=sc.nextFloat();
     double vol=(4*pi*(r*r*r))/3;
     System.out.println("volume of sphere is="+vol);
     
     
	}

}
