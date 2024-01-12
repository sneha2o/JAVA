/*(2)
A car accessories shop assigns code 1 to seat covers, 2 to steering wheel covers ,
3 to car lighting and 4 for air purifiers. All other items have code 5 or more.
While selling the goods, a sales tax of 2% to seat covers ,3% to steering wheel
covers, 4% to car lighting, 2.5% to air purifiers and 1.2% for all other items is
charged. A list containing the product code and price is given for making a bill.
Write a java program using switch statements to prepare a bill.
.*/
import java.util.*;
class s2
{
 public static void main(String args[])
 {
  System.out.println("1 seat cover -15000rs.");
  System.out.println("2 steering wheel cover -1500rs.");
  System.out.println("3 car lighting -7000rs.");
  System.out.println("4 air purifiers -500rs.");
  System.out.println("5 other items -enter amt.");
  System.out.println("\n Enter your choice");
  Scanner sc=new Scanner(System.in);
  int ch=sc.nextInt();
  double amt;
  switch(ch)
  {
	  case 1:
	       amt=15000+(15000*2)/100;
		   System.out.println("seat cover total charges are:"+amt);
		   break;
	  case 2:
	       amt=1500+(1500*3)/100;
		   System.out.println("steering wheel cover total charges are:"+amt);
		   break;
	  case 3:
	       amt=7000+(7000*4)/100;
		   System.out.println("car lighting total charges are:"+amt);
		   break;
	  case 4:
	       amt=500+(500*2.5)/100;
		   System.out.println("air purifiers charges are:"+amt);
		   break;
	  case 5:
	       System.out.println("Enter item:");
		   String name = sc.next();
		   
		   System.out.println("Enter amt:");
		   amt=sc.nextFloat();
		   amt=amt+(amt*1.2)/100;
		   System.out.println(name+"total charges are:"+amt);
		   break;
     default:
	       System.out.println("wrong choice entered");
  }
 }
}