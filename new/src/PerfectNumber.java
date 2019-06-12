

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum=0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter number");
	     n=sc.nextInt();
	     for(i=1;i<=n/2;i++) {
	    	 if(n%i==0)
	    	 {
	    		 sum+=i;
	    		 System.out.println(i);
	    	 }
	     }
		 if(n==sum)
		 {
			 System.out.println(n+"is perfect number");
		 }
		 else
		 {
			 System.out.println(n+"is not perfect number");
		 }
	}

}
