/*(8)A bank gives 6.5% per annum interest on deposits made in that bank. Write a
program to calculate the total amount that a person will receive after the end of
5 years for a deposit of Rs.5000 for compound interest. Create necessary
methods and constructors too.*/

class calamount
{
	double p,r,n;
	calamount(double p1,double r1,double n1)
	{
		p=p1;
		r=r1;
		n=n1;
	}
	void calint()
	{
		double ci = p*(Math.pow((1+(r/100)),n));
		double netv = p+ci;
		System.out.println("Interest is: "+ci+" and amount received is:" +netv);
	}
}
class s8
{
	public static void main(String args[])
	{
		double p=5000,r=6.5,n=5;
		calamount c1=new calamount(p,r,n);
		c1.calint();
	}
}

 