

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,n=30;
		System.out.println(a);
		System.out.println(b);
		do
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}while(n>c);		

	}

}
