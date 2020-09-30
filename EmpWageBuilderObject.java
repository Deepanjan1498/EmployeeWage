public class EmpWageBuilderObject
 {
  static final int PARTTIME=1;
  static final int FULLTIME=2;
  static final int EmpRatePerHour=20;
  static final int NumberOfWorkDays=2;
  public static void main(String args[])
    {
     //variables
     int empHours=0;
     int empWage=0;
     int totalWage=0;
     for(int day=0;day<NumberOfWorkDays;day++)
     {
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
       totalWage+=empWage;
       System.out.println("Employee Wage :"+empWage);
      }
     System.out.println("Total Employee Wage :"+totalWage);
    }
}
