

import java.util.*;

public class ConeVolume {
   static double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of r value");
	float r=sc.nextFloat();
		System.out.println("enter heigh of h value");
	float h=sc.nextFloat();
	double volume=pi*r*r*(h/3);
		
		System.out.println("volume of cone"+volume);
		
		
	}

}
