/*(4)Write a program to calculate the hypotenuse of right angled triangle when other
sides
of the triangle are given. (Hypotenuse = square root (x*x + Y *Y))*/
import java.util.*;
class s4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter value of x");
		int x=sc.nextInt();
		System.out.println("\n Enter value of y");
		int y=sc.nextInt();
		double hyp=Math.sqrt((x*x)+(y*y));
		System.out.println("Hypotenuse of Right angled tringle is:"+hyp);
	}
}