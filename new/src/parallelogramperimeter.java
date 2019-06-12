

import java.util.Scanner;

public class parallelogramperimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float l,b;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter lenth of l value");
	   l=sc.nextFloat();
	   System.out.println("enter breadth of b value");
	   b=sc.nextFloat();
	   double per=2*(l+b);
       System.out.println(" perimeter of parallelogram="+per);
       
	}

}
