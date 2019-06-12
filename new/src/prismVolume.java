

import java.util.Scanner;

public class prismVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vol;
		float b,h;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter breadth of b value");
	   b=sc.nextFloat();
	   System.out.println("enter height of h value");
	   h=sc.nextFloat();
	   vol=h*b;
	   System.out.println("volume of prism is"+vol);;
	}

}
