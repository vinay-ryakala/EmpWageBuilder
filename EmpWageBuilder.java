public class EmpWageBuilder {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");
		int EMP_RATE_PER_HR=20;
		int PRESENT=1;
		int empHrs=0;
		int empWage=0;
		int attendanceCheck=(int)(Math .random()*10%2);

		if (attendanceCheck==PRESENT)
			empHrs=8;
		else
			empHrs=0;
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("Employee Wage: "+empWage);
	}
}

