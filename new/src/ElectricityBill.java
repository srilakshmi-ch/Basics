

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bill;
      @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
      System.out.println("enter nur of units");
      int units=sc.nextInt();
      if(units<100)
      {
    	  bill=units*1.2;
      }
      else if(units<300)
      {
    	  bill=(100*1.2)+((units-100)*2);
    	  
      }
      else
      {
    	  bill=(100*1.2)+(200*2)+((units-200)*3);
      }
      System.out.println("electricity bill is"+bill);
	}

}
