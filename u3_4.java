/*(4)
Write a program that accepts a string from command line and perform following
operations:
1. Display each character on separate line in reverse order.
2. Count total number of chracters and display each character's position too.
3. Identify that whether the string is palindrom or not.
4. Count total number of uppercase and lowercase characters in it.*/

class u3_4
{
	public static void main(String args[])
	{
		char c[]=args[0].toCharArray();
		
		System.out.println("\n Display each character on seperate line in reverse order");
		
		for(int i=c.length-1;i>=0;i--)
		{
			System.out.println(c[i]);
		}
		
		System.out.println("\n Count total number of character add display each characters position");
		
		System.out.println("\n Total number of character are:" +c.length);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+"Character is at" +i+ "Position");
		}
		
		System.out.println("\n Indentity the string is palindrome or not");
		
		String orgstr=args[0];
		
		orgstr=args[0];
		
		int len=orgstr.length();
		
		String revstr="";
		
		for(int i=len-1;i>=0;i--)
			revstr=revstr+orgstr.charAt(i);
		
		System.out.println("\n revstr is: " +revstr);
		
		if(orgstr.equals(revstr))
			System.out.println("\n String is palindrome");
		
		else
			System.out.println("\n String is not palindrome");
		
		System.out.println("\n Total number of uppercase & lowercase characters");
		
		int up=0,lw=0;
		
		for(int i=0;i<c.length;i++)
		{
			if(Character.isUpperCase(c[i]))
				up++;
			
			else if(Character.isLowerCase(c[i]))
				lw++;
		}
		
		System.out.println("\n Uppercase characters are:" +up);
		
		System.out.println("\n Lowercase characters are:" +lw);
	}
}
/*OutPut => javac u3_4.java
            java u3_4 Good

 Display each character on seperate line in reverse order
d
o
o
G

 Count total number of character add display each characters position

 Total number of character are:4
GCharacter is at0Position
oCharacter is at1Position
oCharacter is at2Position
dCharacter is at3Position

 Indentity the string is palindrome or not

 revstr is: dooG

 String is not palindrome

 Total number of uppercase & lowercase characters

 Uppercase characters are:1

 Lowercase characters are:3*/

		
		
			
		