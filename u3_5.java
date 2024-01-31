/*(5)
Write a Java program to input n integer numbers and display lowest and second
lowest number. Also handle the different exceptions possible to be thrown
during execution.*/
class u3_5
{
	public static void main(String args[])
	{
		int a[]=new int [args.length];
		try
		{
			for(int i=0;i<args.length;i++)
			{
				a[i]=Integer.parseInt(args[i]);
			}
			for(int i=0;i<args.length;i++)
			{
				for(int j=i+1;j<args.length;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println("Lowest:" + a[0] + "Second lowest:" + a[1]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException" + "Enter command line arguments");
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormatException" + "Enter Numbers Only");
		}
	}
}
 /*OutPut=>javac u3_5.java

C:\Users\sneha\OneDrive\Desktop\package>java u3_5
ArrayIndexOutOfBoundsException Enter command line arguments

C:\Users\sneha\OneDrive\Desktop\package>java u3_5 0 2 5 10
Lowest: 0 Second lowest:2
			*/