/*(7) Declare an abstract class Vehicle with an abstract method named numWheels(
).provide subclasses Car and Truck that each implements this method. Create
instance of these subclasses and demonstrate the use of this method.*/

abstract class vehcile
{
	abstract void numWheels();
}
class car extends vehcile
{
	void numWheels()
	{
		System.out.println("Car class with four wheels");
	}
}
class truck extends vehcile
{
	void numWheels()
	{
		System.out.println("Truck class with six wheels");
	}
}
class p7
{
	public static void main(String args[])
	{
		car c1=new car();
		c1.numWheels();
		
		truck t1=new truck();
		t1.numWheels();
	}
}
