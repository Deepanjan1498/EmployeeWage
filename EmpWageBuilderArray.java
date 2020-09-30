
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class EmpWageBuilderArray implements IComputeEmpWage {
	public static final int PARTTIME=1;
    public static final int FULLTIME=2;

    private int numOfCompany = 0;
    private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
    private Map<String,CompanyEmpWage> companyToEmpWage;
    
    public EmpWageBuilderArray()  {
        companyEmpWageArrayList = new ArrayList<>();
        companyToEmpWage = new HashMap<>();
    }

public void addCompanyEmpWage(String company,int empRatePerHour, 
                            int numOfWorkingDays,int maxHoursPerMonth) {
     CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, 
                                                            numOfWorkingDays,maxHoursPerMonth);
     companyEmpWageArrayList.add(companyEmpWage);
     companyToEmpWage.put(company,companyEmpWage);
     }
 public void computeEmpWage() {
   for(int i=0; i< companyEmpWageArrayList.size();i++){
      CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i); 
      companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
      System.out.println(companyEmpWage);
     }
}
 @Override
 public int getTotalWage(String company) {
	 return companyToEmpWage.get(company).totalEmpWage;
 }
public int computeEmpWage(CompanyEmpWage companyEmpWage) {
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
    IComputeEmpWage empWageBuilder = new EmpWageBuilderArray();
    empWageBuilder.addCompanyEmpWage( "Dmart",20,2,10);
    empWageBuilder.addCompanyEmpWage( "Reliance",10,4,20);
    empWageBuilder.computeEmpWage();
    System.out.println("Total Wage for DMart Company : " + empWageBuilder.getTotalWage( "DMart"));
    System.out.println("Total Wage for Reliance Company : " + empWageBuilder.getTotalWage( "Reliance"));
   }
}


