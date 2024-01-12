/*(u2_p1)Write a program to sort the elements of one dimensional array. Read value of
array elements through command line argument.*/

class u2_p1
{
	public static void main(String args[])
	{
	
		int a[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			System.out.println("array is=>"+a[i]);
		}
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Here is your result:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Sorted array is=>"+a[i]);
		}
	}
}