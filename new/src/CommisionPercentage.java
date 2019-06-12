

import java.util.Scanner;

public class CommisionPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount,commissionPercentage;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount and commision percentage");
			amount=sc.nextDouble();
			commissionPercentage=sc.nextInt();
        double commission=(commissionPercentage/100)*amount;  	   

    	 System.out.println("Commission amount="+commission);
	}

}
