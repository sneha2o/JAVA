/*(2)
Write a program that create and starts five threads. Each thread is instantiated
from the same class. It executes a loop with ten iterations. Each iteration
displays the character 'x' and sleep for 500 milliseconds. The application waits
for all threads to complete and then display a message 'hello'.*/
class thread1 extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try
			{
				System.out.println("T1----x"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class thread2 extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try
			{
				System.out.println("T2----x"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class thread3 extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try
			{
				System.out.println("T3----x"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class thread4 extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=10;i++)
		{
			try
			{
				System.out.println("T4----x"+i);
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
class u4_2
{
	public static void main(String args[])
	{
		thread1 th1=new thread1();
	    thread2 th2=new thread2();
		thread3 th3=new thread3();
		thread4 th4=new thread4();
		
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		Thread t3=new Thread(th3);
		Thread t4=new Thread(th4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("********Hello**********");
	}
}
/*OUTPUT=>javac u4_2.java

C:\Users\sneha\OneDrive\Desktop\JAVA>java u4_2
T1----x1
T3----x1
T4----x1
T2----x1
T1----x2
T3----x2
T4----x2
T2----x2
T1----x3
T3----x3
T2----x3
T4----x3
T1----x4
T2----x4
T4----x4
T3----x4
T1----x5
T4----x5
T2----x5
T3----x5
T1----x6
T2----x6
T3----x6
T4----x6
T1----x7
T4----x7
T2----x7
T3----x7
T1----x8
T4----x8
T3----x8
T2----x8
T1----x9
T4----x9
T2----x9
T3----x9
T1----x10
T3----x10
T2----x10
T4----x10
********Hello**********
*/
				
		
