/*(8)Write an interface called Exam with a method Pass(int mark) that returns a
Boolean. Write another interface called Classify with a method Division(int
average) which returns a string. Write a class called Result which implements
both Exam and Classify. The pass method should return true if the marks is
greater than or equal to 35 else false. The division method must return "First"
when the parameter average is 60 or more, "second" when average is 50 or
more but below 60, "no division" when average is less than 50.*/

interface exam
{
	boolean pass(int marks);
}
interface classify
{
	String division(int avg);
}
class result implements exam,classify
{
	public boolean pass(int marks)
	{
		if(marks>=35)
			return(true);
		else
			return(false);
	}
	public String division(int avg)
	{
		if(avg>=60)
			return("first");
		else if(avg<60 && avg>=50)
			return("second");
		else
			return("no division");
	}
}
class p8
{
	public static void main(String args[])
	{
		result r1=new result();
		System.out.println("\n Your result is:"+r1.pass(80));
		System.out.println ("\n Your division is:"+r1.division(80));
	}
}



