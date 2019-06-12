

import java.util.Scanner;

public class vowel_consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter charecter");
	   char  ch=sc.next().charAt(0);
	   if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' )
	   {
		   System.out.println(ch+"is vowel");
	   }
	   else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
	   {
		   System.out.println(ch+"is consonent");
	   }
	   else
	   {
		   System.out.println(ch+"is special symbol");
	   }
	}

}
