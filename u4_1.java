/*(1)
Write an application that starts two thread. First thread displays even numbers
in the range specified from the command line and second thread displays odd
numbers in the same range. Each thread waits for 300 milliseconds before
displaying the next numbers. The application waits for both the thread to finish
and then displays the message "Both threads completed".
*/

class eventhread extends Thread
{
	int ll,up;
	eventhread(int x,int y)
	{
		ll=x;
		up=y;
	}
	public void run()
	{
		try{
			for(int i=ll;i<=up;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(300);
					System.out.println("Even Thread"+i);
				}
			}
		}
		catch(Exception e){}
	}
}
class oddthread extends Thread
{
	int ll,up;
	oddthread(int x,int y)
	{
		ll=x;
		up=y;
	}
	public void run()
	{
		for(int i=ll;i<=up;i++)
		{
			if(i%2!=0)
			{
				System.out.println("Odd Thread"+i);
			}
		}
	}
}
class u4_1
{
	public static void main(String args[])
	{
		int ll=Integer.parseInt(args[0]);
		int up=Integer.parseInt(args[1]);
		
		eventhread e1=new eventhread(ll,up);
		oddthread o1=new oddthread(ll,up);
		
		e1.start();
		o1.start();
		
		try{
			e1.join();
			o1.join();
		}
		catch(InterruptedException e){}
		System.out.println("\n Both threads completed");
	}
}
/* OUTPUT=>javac u4_1.java
java u4_1 5 10
Odd Thread5
Odd Thread7
Odd Thread9
Even Thread6
Even Thread8
Even Thread10

 Both threads completed
 */

		