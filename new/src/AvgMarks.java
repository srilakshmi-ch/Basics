

import java.util.Scanner;

public class AvgMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[],i,n,sum=0;
		float avg=0;
		arr=new int[10];
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of subjects");
		n=sc.nextInt();
		System.out.println("enter marks");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum+=arr[i];
		}
		avg=sum/n;
		System.out.println("average of marks="+avg);
			
	}

}
