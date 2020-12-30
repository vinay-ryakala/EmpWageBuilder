public class EmpWageBuilder implements EmployeeWageOops
{
	//constant
   public static final int IS_FULL_TIME = 1;
   public static final int IS_PART_TIME = 2;

	private int numOfCompany = 0;
	private CompanyEmpWage[] companyEmpWageArray;
	public EmpWageBuilder() 
	{
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	public void addCompanyEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth) 
	{
	companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHr, numberOfWorkingDays, maxHrPerMonth);

	numOfCompany++;
	}

	public void computeEmpWage() 
	{
			for (int i=0; i<numOfCompany; i++) 
		{
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private  int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		//Variables
      int empHrs=0;
      int totalEmpHrs=0;
      int totalWorkingDays=0;

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
         totalEmpHrs+=empHrs;
      }
      return totalEmpHrs*companyEmpWage.empRatePerHr;
           
	}

	public static void main (String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
	   EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("swiggy",20,5,20);
		empWageBuilder.addCompanyEmpWage("zomato",20,5,20);
      empWageBuilder.computeEmpWage();
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

