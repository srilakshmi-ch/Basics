

public class Sum_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=145;
		int rem,sum=0;
		while(num!=0)
		{
			rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("sum of digits="+sum);
	}

}
