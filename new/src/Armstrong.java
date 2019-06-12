

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num,rem=0,arm=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		num=sc.nextInt();
		n=num;
		while(n!=0)
		{
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(num==arm)
		{
			System.out.println("given number is armstrong");
		}
		else
		{
			System.out.println("given number is not armstrong");;
		}
		
	}

}
