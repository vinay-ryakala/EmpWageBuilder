public class EmpWageBuilder {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");
		int EMP_RATE_PER_HR=20;
		int IS_FULL_TIME=1;
		int IS_PART_TIME=2;

		int empHrs=0;
		int empWage=0;
		int empCheck=(int)(Math .random()*10%3);
      if(empCheck==IS_FULL_TIME)
               {
                       empHrs=8;
               }
      else if(empCheck==IS_PART_TIME)
               {
                       empHrs=4;
               }
      else
               {
                       empHrs=0;
               }
      empWage=empHrs*EMP_RATE_PER_HR;
      System.out.println("Employee wage:" +empWage);

	}
}

