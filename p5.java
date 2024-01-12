/*(5)Write an interface called numbers, with a method in Process(int x, int y). Write a
class called Sum, in which the method Process finds the sum of two numbers
and returns an int value. Write another class called Average, in which the
Process method finds the average of the two numbers and returns an int.*/

import java.util.*;
interface numbers
{
	int process(int x,int y);
}
class sum implements numbers
{
	public int process(int x,int y)
	{
		return (x+y);
	}
}
class average extends sum
{
	public int process(int x,int y)
	{
		return((x+y)/2);
	}
}
class p5
{
	public static void main(String args[])
	{
		int x,y;
		sum s1=new sum();
		average a1=new average();
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number->");
		x=obj.nextInt();
		System.out.println("Enter a Another number->");
		y=obj.nextInt();
		System.out.println("Sum=>+"+s1.process(x,y));
		System.out.println("Average=>"+a1.process(x,y));
	}
}

		