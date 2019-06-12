
import java.util.*;
public class TriangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area;
		float b,h;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter bredth of b value");
	   b=sc.nextFloat();
	   System.out.println("enter height of h value");
	   h=sc.nextFloat();
	   area=b*h/2;
	   System.out.println("area of triangle="+area);

	}

}
