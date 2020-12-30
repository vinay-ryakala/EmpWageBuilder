public class EmpWageBuilder 
{

	//CONSTANTS
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;

	public static void computeEmpWage(String company, int empRatePerHr, int numberOfWorkingDays, int maxHrPerMonth)
	{
		//Variables
      int empHrs=0;
      int totalEmpHrs=0;
      int salary=0;
      int totalWorkingDays=0;

      while (totalEmpHrs<maxHrPerMonth && totalWorkingDays<numberOfWorkingDays)
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
      salary=totalEmpHrs*empRatePerHr;
      System.out.println("Number of working days:"+totalWorkingDays+" and Total emp hrs: "+totalEmpHrs);
      System.out.println("Employee wage for company :"+company+"is :"+salary);

	}
	public static void main (String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
	   computeEmpWage("swiggy",30,5,10);
		computeEmpWage("zomato",40,8,20);
	}
}

