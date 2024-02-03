/*(8)
Write a program which takes the age of 5 persons from command line and find
the average age of all persons. The program should handle exception if the
argument is not correctly formatted and custom exception if the age is not
between 1 to 100.*/
class RangeException extends Exception
{
	RangeException(String message)
	{
		super(message);
	}
}
class u3_8
{
	public static void main(String args[])
	{
	  int a[]=new int [5];
   	  int sum=0;
	  try
	 {
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			if(a[i]<0 || a[i]>100)
			{
				throw new RangeException("Invalid Range:"+a[i]);
			}
		}
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("\n Average is:"+(sum/5));
	 }
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException" + "Enter Command line arguments");
	}
	catch(NumberFormatException e)
	{
		System.out.println("NumberFormatException" + "Enter Numbers Only");
	}
	catch(RangeException e1)
	{
	  System.out.println("Error:"+e1.getMessage());
	}
  }
}
/*OUTPUT=>javac u3_8.java

java u3_8 -1 
Error:Invalid Range:-1//<0 || >100 is invalid

C:\Users\sneha\OneDrive\Desktop\package>java u3_8  102
Error:Invalid Range:102

java u3_8 10 20 30 40 50

 Average is:30

C:\Users\sneha\OneDrive\Desktop\package>java u3_8 99 88 77 66 55

 Average is:77
 */


