/*(6)Create a class called NumberData that accept any array of the five numbers.
Create a sub class called Numplay which provides methods for followings:
1. Display numbers entered.
2. Sum of the number.
3. Average of the numbers.
4. Maximum of the numbers.
5. Minimum of the numbers.
Create a class that provides menu for above methods. Give choice from the
command-line argument.*/
import java.util.*;

class Numberdata
{
	int a[]=new int[5];
	
	Scanner obj=new Scanner(System.in);
	
	void createarray()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("\n Enter Element->");
			a[i]=obj.nextInt();
		}
	}
}
class Numplay extends Numberdata
{
	void display()
	{
		createarray();
		for(int i=0;i<5;i++)
		{
			System.out.println("\n Elements=>"+a[i]);
		}
	}
	void sum()
	{
		int s=0;
		
		createarray();
		
		for(int i=0;i<5;i++)
		{
			s+=a[i];
		}
		System.out.println("\n Sum is=>"+s);
	}
	void avg()
	{
		int sum=0;
		createarray();
		
		for(int i=0;i<5;i++)
		{
			sum+=a[i];
		}
		float a=(float)sum/5;
		System.out.println("Average is=>"+a);
	}
	void max()
	{
		int m=0;
		
		createarray();
		
		for(int i=0;i<5;i++)
		{
			if(m<a[i])
				m=a[i];
		}
		System.out.println("\n Maximun is=>"+m);
	}
	void min()
	{
		createarray();
		
		int m=a[0];
		
		for(int i=0;i<5;i++)
		{
			if(m>a[i])
				m=a[i];
		}
		System.out.println("\n Minimum is=>"+m);
	}
}
class p6
{
	public static void main(String args[])
	{
		Numplay obj=new Numplay();
		
		int ch=Integer.parseInt(args[0]);
		
		switch(ch)
		{
			case 1:obj.display();
			break;
			
			case 2:obj.sum();
			break;
			
			case 3:obj.avg();
			break;
			
			case 4:obj.max();
			break;
			
			case 5:obj.min();
			break;
			
			default: System.out.println("Wrong Choice!!");
		}
	}
}
