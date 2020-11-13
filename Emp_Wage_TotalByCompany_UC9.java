 
package daytwentytwo;

 
public class Emp_Wage_TotalByCompany_UC9
{
    // Constants
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

public Emp_Wage_TotalByCompany_UC9(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
{
// Variables
    this.company = company;
    this.empRatePerHour = empRatePerHour;
    this.numOfWorkingDays = numOfWorkingDays;
    this.maxHoursPerMonth = maxHoursPerMonth;
}

public void computeEmpWage()
{
// Variables
    int empHrs =0;
    int totalWorkingDays =0;
    int totalEmpHrs =0;
	//Computation
while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
{
    totalWorkingDays++;
    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    switch (empCheck)
    {
    case IS_PART_TIME:
	empHrs =4;
	break;
    case IS_FULL_TIME:
	empHrs =8;
	break;
    default:
	empHrs =0;
    }
totalEmpHrs += empHrs;
System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
} 

    totalEmpWage = totalEmpHrs * empRatePerHour;
}

@Override
public String toString()
{	
	return "Total Emp Wage for Company: " +company+" is: "+totalEmpWage;
}
	

public static void main (String[] args)
    {
Emp_Wage_TotalByCompany_UC9 dMart = new Emp_Wage_TotalByCompany_UC9("DMart", 20, 2, 10);
Emp_Wage_TotalByCompany_UC9 reliance = new Emp_Wage_TotalByCompany_UC9("Reliance", 10, 4, 20);
    dMart.computeEmpWage();
    System.out.println(dMart);
    reliance.computeEmpWage();
    System.out.println(reliance);	
    }
}