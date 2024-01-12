/*(3)Write a program to create an array to store 5 integer values. Also initialize the
array with 5 numbers and display the array Elements in reverse order.
3 Write a program to find sum of two matrices of 3 x3.*/
import java.util.*;
class p3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[] []=new int [3] [3];
		int b[] []=new int [3] [3];
		int c[] []=new int [3] [3];
		
		System.out.println("Enter Elements of first matrix of order 3*3");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter first matrix value of an array");
				a[i] [j]=sc.nextInt();
			}
		}
		System.out.println("Enter Elements of second matrix of order 3*3");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter second matrix value of an array");
				b[i] [j]=sc.nextInt();
			}
		}
		System.out.println("The Addition of matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i] [j]=a[i] [j]+b[i] [j];
				System.out.print(c[i] [j]+ " ");
			}
			System.out.println("\n");
		}
	}
}
