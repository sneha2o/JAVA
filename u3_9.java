/*(9)
 Write an application that converts between meters and feet. Its first commandline argument is a number and second command line argument is either
 "centimeter" or "meter". If the argument equals "centimeter" displays a string
 reporting the equivalent number of meters. If this argument equals "meters",
 display a string reporting the equivalent number of centimeter. If unit is not
 given properly then generate custom exception Unitformatexception. If first
 argument is not proper format then generate numberformatexception.
 Generate other exception as per requirements. (1 meter=100 centimeter)
 */
class UnitFormatException extends Exception
{
	UnitFormatException(String s)
	{
		super("UnitFormatException: Unit is not valid:"+s);
	}
}
class u3_9
{
	public static void main(String args[])
	{
		int no;
		String u;
		try
		{
			no=Integer.parseInt(args[0]);
			u=args[1];
			if((u.equals("centimeter")) || (u.equals("meter")))
			{
				if(u.equals("centimeter"))
				{
					int m=no/100;
					System.out.println("\n Equivalent number of meter is :"+m);
				}
				else
				{
					int cm=no*100;
					System.out.println("\n Equivalent number of centimeter is:"+cm);
				}
			}
			else{
				throw new 
				UnitFormatException(u);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException occurs");
		}
		catch(UnitFormatException e1)
		{
			System.out.println("Error:"+e1.getMessage());
		}
	}
}
/*OUTPUT=>>javac u3_9.java

           java u3_9 10 meter

 Equivalent number of centimeter is:1000

C:\Users\sneha\OneDrive\Desktop\package>java u3_9 150 centimeter

 Equivalent number of meter is :1

C:\Users\sneha\OneDrive\Desktop\package>java u3_9 5 inches//UnitFormatException
Error:UnitFormatException: Unit is not valid:inches

C:\Users\sneha\OneDrive\Desktop\package>java u3_9//No arguments
ArrayIndexOutOfBoundsException occurs

C:\Users\sneha\OneDrive\Desktop\package>java u3_9 abc meter//NumberFormatException
NumberFormatException occurs
*/