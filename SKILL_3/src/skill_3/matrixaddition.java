package skill_3;

import java.util.Scanner;

public class matrixaddition {
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		a=sc.nextInt();
		System.out.println("Enter number of columns: ");
		b=sc.nextInt();
		int[][]matrix1=new int[a][b];
		int[][]matrix2=new int[a][b];
		int[][]sum=new int[a][b];
		System.out.println("Enter the 1st matrix: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the 2nd matrix: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		System.out.println("Sum: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(sum[i][j] +" ");
			}
		}
	}
}
