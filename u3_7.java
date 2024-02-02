/*(7)
 Write an application that accepts marks of three different subject from user.
 Marks should be between 0 to 100, if marks of any of the subject is not belong
 to this range, generate custom exception out of RangeException. If marks of
 each subjects are greater than or equal to 40 then display message "PASS" along
 with percentage, otherwise display message "FAIL". Also write exception
 handling code to catch all the possible runtime exceptions likely to be generated
 in the program.
*/
class RangeException extends Exception
{
	RangeException(int i)
	{
		super("RangeException: Marks is not valid:"+i);
	}
}
class u3_7
{
	public static void main(String args[])
	{
		int a[]=new int[3];
		int sum=0;
		float per;
		for(int i=0;i<3;i++)
		{
			try
			{
				a[i]=Integer.parseInt(args[i]);
				if(a[i]<0 || a[i]>100)
				{
					throw new RangeException(a[i]);
				}
				else if(a[i]>=40)
				{
					sum=sum+a[i];
					System.out.println("\n Pass in subject:"+i);
				}
			}
			catch(RangeException e1)
			{
				System.out.println("Error:"+e1.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array index Exception occurs");
			}
			catch(NumberFormatException e)
			{
				System.out.println("NumberFormatException");
			}
		}
		per=(float)sum/3;
		System.out.println("\n Percentage is:"+per);
	}
}
/*OUTPUT=>>javac u3_7.java

java u3_7 10 45 99

 Pass in subject:1

 Pass in subject:2

 Percentage is:48.0

C:\Users\sneha\OneDrive\Desktop\package>java u3_7 10 45 102

 Pass in subject:1
Error:RangeException: Marks is not valid:102

 Percentage is:15.0
 */