/*(5)Write a program to calculate the area of square and rectangle by overloading
the area method.*/
class s5
{
 void area(int l)
 {
	 System.out.println("Area of square is:"+(l*l));
 }
 void area(int l,int b)
 {
	 System.out.println("Area of rectangle is:"+(l*b));
 }
 public static void main(String args[])
 {
	 s5 s=new s5();
	 s.area(5);
	 s.area(5,6);
 }
}
 