

import java.util.Scanner;

public class Product_Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        float cost,dis;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter product price");
		cost=sc.nextFloat();
		System.out.println("enter discount");
		dis=sc.nextFloat();
		dis=100-dis;
		float amount=cost*(dis/100);
		System.out.println("amount for oproduct="+amount);
		
	}

}
