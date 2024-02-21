interface one 
{
	void show();
}
interface two
{
	void show();
}
class multiple implements one,two
{
	public void show()
	{
		System.out.println("Interface One & Two");
	}
	public static void main(String args[])
	{
		multiple m=new multiple();
		m.show();
	}
}
/*OUTPUT=>>javac multiple.java

C:\Users\sneha\OneDrive\Desktop\JAVA>java multiple
Interface One & Two
*/
