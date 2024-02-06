/*(10)
Write a program that accepts 5 even numbers from command line , if any of the
numbers is odd then throw custom exception OddException and count such
invalid numbers.*/
class oddnumberException extends Exception
{
	oddnumberException(int i)
	{
		super("Number is odd:"+i);
	}
}
class u3_10
{
	public static void main(String args[])
	{
		int a[]=new int [args.length];
		for(int i=0;i<args.length;i++)
		{
			try
			{
				a[i]=Integer.parseInt(args[i]);
				if(a[i]%2!=0)
				{
					throw new oddnumberException(a[i]);
				}
			}
			catch(oddnumberException e)
			{
				System.out.println("Exception Occured:"+e);
			}
		}
	}
}
/*OUTPUT=>>javac u3_10.java

java u3_10 10 5 30 2 12
Exception Occured:oddnumberException: Number is odd:5

java u3_10 1 2 3 4 5
Exception Occured:oddnumberException: Number is odd:1
Exception Occured:oddnumberException: Number is odd:3
Exception Occured:oddnumberException: Number is odd:5
*/
