

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,count=0;
	    for(int i=2;i<=n/2;i++)
	    {
	    	if(n%i==0)
	    	{
	    		count++;
	    	}
	    		
	    }
	    if(count==0) {
	    	System.out.println("prime");
	    }
	    else {
	    	System.out.println("not prime");
	    }
	}

}
