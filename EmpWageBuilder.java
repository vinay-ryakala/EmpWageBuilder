public class EmpWageBuilder 
{

	//CONSTANTS
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=20;

	public static void main (String[] args)
	{
		System.out.println("Welcome to Employee Wage Computation");
	   //Variables
	   int empHrs=0;
		int totalEmpHrs=0;
	   int salary=0;
		int day=0;
		for(day=0;day<NUM_OF_WORKING_DAYS;day++)
		{
			int empCheck=(int)(Math .random()*10%3);

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
		System.out.println("Employee wage :"+salary);	
	}
}

