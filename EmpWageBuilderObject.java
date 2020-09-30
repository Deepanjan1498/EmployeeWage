public class EmpWageBuilderObject
{
   final static int PARTTIME=1;
   final static int FULLTIME=2;
   final static int EmpRatePerHour=20;
  public static void main(String args[])
   {
	//variables
	int empHours=0;
	int empWage=0;
	int empCheck=(int)Math.floor(Math.random()*10)%3;
	switch(empCheck)
	{
	    case FULLTIME:
                 empHours=8;
            break;
	    case PARTTIME:
                 empHours=4;
            break;
            default:
                empHours=0;
         }
      empWage=empHours*EmpRatePerHour;
     System.out.println("Employee Wage :"+empWage);
    }
}
