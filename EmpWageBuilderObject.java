public class EmpWageBuilderObject
{
public static void main(String[] args)
{ //Constants
int FULLTIME = 1;
//Computation
double empCheck = Math.floor(Math.random() * 10) % 2;
if(empCheck == FULLTIME)
System.out.println("Employee is Present");
else
System.out.println("Employee is Absent");
}
}
