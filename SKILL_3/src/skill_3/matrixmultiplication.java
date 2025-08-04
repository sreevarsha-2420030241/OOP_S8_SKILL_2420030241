package skill_3;

import java.util.Scanner;

public class matrixmultiplication {
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		a=sc.nextInt();
		System.out.println("Enter the number of cloumns: ");
		b=sc.nextInt();
		int[][]matrix1=new int[a][b];
		int[][]matrix2=new int[a][b];
		int multiply[][]=new int[a][b];
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
				multiply[i][j] += matrix1[i][j]*matrix2[i][j];
			}
		}
		System.out.println("Answer: ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(multiply[i][j] +" ");
			}
		}
	}
}
