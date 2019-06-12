

import java.util.*;

public class Distance_Between_Points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x1,x2,y1,y2;
		double distance;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x1 y1 points");
		x1=sc.nextFloat();
		y1=sc.nextFloat();
		System.out.println("enter x2 y2 points");
		x2=sc.nextFloat();
		y2=sc.nextFloat();
		distance=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		
		System.out.println("distance is="+distance);
	}

}
