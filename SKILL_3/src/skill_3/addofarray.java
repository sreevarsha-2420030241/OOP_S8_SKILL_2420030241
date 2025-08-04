package skill_3;

import java.util.Scanner;

public class addofarray {
	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number of elements: ");
		n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		double average=(double)sum/n;
		System.out.println("average: " +average);
		System.out.println("sum: " +sum);
	}
}
