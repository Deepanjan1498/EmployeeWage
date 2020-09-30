public class EmpWageBuilderObject{
    public static final int PARTTIME=1;
    public static final int FULLTIME=2;
    
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    
    public EmpWageBuilderObject(String company,int empRatePerHour, 
                                int numOfWorkingDays,int maxHoursPerMonth)  {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
     }

    public void computeEmpWage() {
    //variables
    int empHours=0;
    int totalEmpHours=0;
    int totalWorkingDays=0;
    while(totalEmpHours<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays) {
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
    totalEmpWage=totalEmpHours*empRatePerHour;
    }
   @Override
    public String toString()   {
           return "Total Emp Wage for Company: " +company+ " is: " + totalEmpWage;
             }
  public static void main(String[] args) {
        EmpWageBuilderObject dMart = new EmpWageBuilderObject("Dmart",20,2,10);
        EmpWageBuilderObject reliance = new EmpWageBuilderObject("Reliance",10,4,20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
        }
}
