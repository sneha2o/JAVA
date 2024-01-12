import java.util.*;

class p2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter value of an array:");
			a[i]=sc.nextInt();
		}
		for(int i=4;i>=0;i--)
		{
			System.out.println("\n Reverce numbers are:"+a[i]);
		}
	}
}