public class EmpWageBuilder {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");
		int present=1;
		int attendanceCheck=(int)(Math .random()*10%2);

		if (attendanceCheck==present)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}

