public class EmpWageBuilderObject
{
   public static void main(String args[])
  {
   //constants
   int FULLTIME=1;
   int EmpRatePerHour=20;
   //variables
   int empHours=0;
   int empWage=0;
   int empCheck=(int)(Math.random()*10)%2;
   if(empCheck==FULLTIME)
      empHours=8;
   else
      empHours=0;
   empWage=empHours*EmpRatePerHour;
   System.out.println("Employee Wage :"+empWage);
   }
}
