package skill_3;

import java.util.Scanner;

public class smallestandlargest {
	public static void main(String[] args)
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0];
		int max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Smallest number: " +min);
		System.out.println("Largest number: " +max);
		
		
	}
}
