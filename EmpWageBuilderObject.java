public class EmpWageBuilderObject{
    public static final int PARTTIME=1;
    public static final int FULLTIME=2;
    public static final int EmpRatePerHour=20;
    public static final int NumberOfWorkDays=2;
    public static final int MaxWorkHrs=10;

    public static int computeEmpWage(){
    //variables
    int empHours=0;
    int totalHours=0;
    int totalWorkingDays=0;
    while(totalHours<=MaxWorkHrs && totalWorkingDays<NumberOfWorkDays)
    {
     totalWorkingDays++;
     int empCheck=(int)Math.floor(Math.random()*10)%3;
     switch(empCheck){
     case FULLTIME:
          empHours=8;
     break;
     case PARTTIME:
          empHours=4;
     break;
     default:
          empHours=0;
     }
   totalHours+=empHours;
   System.out.println("Days :"+totalWorkingDays+" Hours :"+empHours);
   }
   int totalWage=totalHours*EmpRatePerHour;
   System.out.println("Total Employee Wage :"+totalWage);
   return totalWage;
   }
    public static void main(String[] args){
        computeEmpWage(); }
}
