/*(4)Write program to create an array of company name and another array of price
quoted by the company. Fetch the company name who has quoted the lowest
amount.*/
import java.util.*;
class p4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int p[]=new int[5];
		String n[]=new String[5];
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter name of company");
			n[i]=sc.next();
			System.out.println("Enter price quoted");
			p[i]=sc.nextInt();
		}
		int min=p[0];
		
		for(int i=0;i<5;i++)
		{
			if(min>p[i])
			{
				min=p[i];
			}
		}
		for(int i=0;i<5;i++)
		{
			System.out.println("The company quoted min amount is "+n[i]);
			break;
		}
	}
}
			