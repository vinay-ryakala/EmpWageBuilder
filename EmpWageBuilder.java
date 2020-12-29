public class EmpWageBuilder 
{

	//CONSTANTS
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static final int MAX_HR_IN_MONTH=100;

	public static void main (String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
	   //Variables
	   int empHrs=0;
		int totalEmpHrs=0;
	   int salary=0;
		int totalWorkingDays=0;
		while (totalEmpHrs<MAX_HR_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
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
		salary=totalEmpHrs*EMP_RATE_PER_HR;
		System.out.println("Number of working days:"+totalWorkingDays+" and Total emp hrs: "+totalEmpHrs);
		System.out.println("Employee wage :"+salary);	
	}
}

