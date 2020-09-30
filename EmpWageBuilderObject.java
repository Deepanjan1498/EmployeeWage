public class EmpWageBuilderObject{
    public static final int PARTTIME=1;
    public static final int FULLTIME=2;
    
    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth){
    //variables
    int empHours=0;
    int totalEmpHours=0;
    int totalWorkingDays=0;
    while(totalEmpHours<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
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
   totalEmpHours+=empHours;
   System.out.println("Days :"+totalWorkingDays+" Hours :"+empHours);
   }
   int totalEmpWage=totalEmpHours*empRatePerHour;
   System.out.println("Total Employee Wage for Company :"+company+ " is: "+totalEmpWage);
   return totalEmpWage;
   }
    public static void main(String[] args){
        computeEmpWage("Dmart", 20 ,2,10);
        computeEmpWage("Reliance",10,4,20); }
}
