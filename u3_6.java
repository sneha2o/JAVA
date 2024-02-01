/*(6)
Write a program that takes a string from the user and validate it. The string
should be at least 5 characters and should contain at least one digit. Display an
appropriate valid message.
*/

class validatestring extends Exception
{
	validatestring(String s)
	{
		System.out.println("\n String is not valid"+s);
	}
}
class u3_6
{
	public static void main(String args[])
	{
		String s = args[0];
		char c[]=s.toCharArray();
		int flag=0;
		try
		{
			if(s.length()>=5)
			{
				for(int i=0;i<s.length();i++)
				{
					if(Character.isDigit(c[i]))
					{
						flag=1;
						System.out.println("\n String is valid ");
						break;
					}
				}
				if(flag==0)
					throw new validatestring(s);
			}
			else 
			{
				throw new validatestring(s);
			}
		}catch(Exception e){}
	}
}
/* OUTPUT=> javac u3_6.java

C:\Users\sneha\OneDrive\Desktop\package>java u3_6
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at u3_6.main(u3_6.java:12)

C:\Users\sneha\OneDrive\Desktop\package>java u3_6 12abc

 String is valid
 */ 