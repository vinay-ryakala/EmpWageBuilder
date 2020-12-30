import java.util.HashMap;
import java.util.ArrayList;

public class EmpWageBuilder implements EmployeeWageOops
{
	//constant
   public static final int IS_FULL_TIME = 1;
   public static final int IS_PART_TIME = 2;

	private ArrayList<CompanyEmpWage> companyEmpWageArrayList;
	private HashMap<String,CompanyEmpWage> companyEmpWageMap;
	public EmpWageBuilder() 
	{
		companyEmpWageArrayList = new ArrayList<>();
		companyEmpWageMap= new HashMap<>();
	}
	public void addCompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) 
	{
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHr, numberOfWorkingDays, maxHrPerMonth);
		companyEmpWageArrayList.add(companyEmpWage);
		companyEmpWageMap.put(company, companyEmpWage);
	}

	public void computeEmpWage() 
	{
			for (int i=0; i<companyEmpWageArrayList.size(); i++) 
		{
			CompanyEmpWage companyEmpWage = companyEmpWageArrayList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}

	private  int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		//Variables
      int empHrs=0;
      int totalEmpHrs=0;
      int dailySalary=0;
		int totalWorkingDays=0;
		ArrayList<Integer> dailyWage=new ArrayList<Integer>();

      while (totalEmpHrs<companyEmpWage.maxHrPerMonth && totalWorkingDays<companyEmpWage.numberOfWorkingDays)
      {
         int empCheck=(int)(Math .random()*10%3);
         totalWorkingDays++;
             switch(empCheck)
             {
               case IS_FULL_TIME:
               empHrs=8;
               break;

               case IS_PART_TIME:
               empHrs=4;
               break;

               default:
               empHrs=0;
             }
         	int daySalary=empHrs*companyEmpWage.empRatePerHr;
				dailyWage.add(daySalary);
				totalEmpHrs+=empHrs;
      }
      System.out.println("Dailywage of employee for company"+companyEmpWage.company+"is:"+dailyWage);
		return totalEmpHrs*companyEmpWage.empRatePerHr; 
	}

	public int getTotalEmpWage(String company) 
	{
		return companyEmpWageMap.get(company).salary;
	}
	public static void main (String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
	   EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("swiggy",20,5,20);
		empWageBuilder.addCompanyEmpWage("UberEats",30,10,40);
		empWageBuilder.addCompanyEmpWage("zomato",20,5,20);
		empWageBuilder.addCompanyEmpWage("FoodPanda",15,8,30);
      empWageBuilder.computeEmpWage();
		System.out.println("Total wage of queried by zomato: "+empWageBuilder.getTotalEmpWage("zomato"));
	}
}
 class CompanyEmpWage
{

   public final String company;
   public final int empRatePerHr;
   public final int numberOfWorkingDays;
   public final int maxHrPerMonth;
   public int salary;

   public CompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth)
   {
      this.company = company;
      this.empRatePerHr = empRatePerHr;
      this.numberOfWorkingDays = numberOfWorkingDays;
      this.maxHrPerMonth = maxHrPerMonth;
   }

   public void setTotalEmpWage(int salary)
   {
      this.salary = salary;
   }
   public String toString() {
         return "Total employee wage for: " +company+ " is " +salary;
   }
}
interface EmployeeWageOops
{
   public void addCompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays,int maxHrPerMonth);
   public void computeEmpWage();
}
