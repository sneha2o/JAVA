/*(7)A shop during festival season offers a discount 10% for purchase made up to
Rs.1,000,
12% for purchase value of Rs.1,000 or more up to Rs 1,500 and 15% for
purchase value
of Rs.1,500 or more. Write a program to implement the above scheme for a
given sales
and print out the sales and print out the sales value, discount and net amount
payable by
a customer. Create necessary methods and constructors.*/

import java.util.*;
class calcost
{
	int sv,dis;
	float netv;
	calcost()
	{
		sv=0;
		dis=0;
		netv=0;
	}
	void netpay(int sv)
	{
		if(sv<=1000)
		{
			dis=10;
		}
		else if(sv>1000 && sv<1500)
		{
			dis=12;
		}
		else
		{
			dis=15;
		}
		netv=sv-((sv*dis)/100);
		System.out.println("After discount net value for"+sv+"is"+netv);
	}
}
class s7
{
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter purchase value");
		n=sc.nextInt();
		calcost c1=new calcost();
		c1.netpay(n);
	}
}