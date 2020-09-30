
public class EmpWageBuilderArray {
	public static final int PARTTIME=1;
    public static final int FULLTIME=2;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public EmpWageBuilderArray()  {
        companyEmpWageArray = new CompanyEmpWage[5];
    }

private void addCompanyEmpWage(String company,int empRatePerHour, 
                            int numOfWorkingDays,int maxHoursPerMonth) {
     companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, 
                                                            numOfWorkingDays,maxHoursPerMonth);
     numOfCompany++;
     }
private void computeEmpWage() {
   for(int i=0; i< numOfCompany;i++){
      companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
      System.out.println(companyEmpWageArray[i]);
     }
}
private int computeEmpWage(CompanyEmpWage companyEmpWage) {
//variables
int empHours=0;
int totalEmpHours=0;
int totalWorkingDays=0;
while(totalEmpHours<= companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays) {
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
return totalEmpHours*companyEmpWage.empRatePerHour;
}

public static void main(String[] args) {
    EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
    empWageBuilder.addCompanyEmpWage("DMart",20,2,10);
    empWageBuilder.addCompanyEmpWage("Reliance",10,4,20);
    empWageBuilder.computeEmpWage();
    }

}
