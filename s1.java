/*(2)A motor cycle dealer sells two-wheelers to his customer on loan, which is to be
repaid in 5 years. The dealer charges simple interest for the whole term on the
day of giving the loan itself. The total amount is then divided by 60(months) and
is collected as equated monthly instalment (EMI). Write a program to calculate
the EMI for a loan of Rs. X, where X is given from command line argument. Print
the EMI value in rupees.*/
class s1
{
 public static void main(String args[])
 {
  int loanamt=Integer.parseInt(args[0]);
  float rate=Float.parseFloat(args[1]);
  int time=5;
  float si=(loanamt*time*rate)/100;
  
  System.out.println("simple interest is:"+si);
  float totalamt = si + loanamt;
  
  System.out.println("totalamt is:"+totalamt);
  float emi = totalamt/12;
  
  System.out.println("EMI is:"+emi);
 }
}