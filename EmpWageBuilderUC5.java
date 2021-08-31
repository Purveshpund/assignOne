package assingmentEmp;
// this usecase is to Calculate the Wages for a Month
public class EmpWageBuilderUC5 {
	public static void main(String[] args) {
		
		// Class Members(Constants)
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20; //USD
		final int NUM_OF_WORKING_DAYS = 25;
		
		
		// Class Members(variables)
		int empHours = 0; int empWage = 0; int totalEmpWage = 0;
		
		//Computation
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			switch ((int)empCheck) {
			case IS_FULL_TIME :
				empHours = 8;
				break;
			case IS_PART_TIME :
				empHours = 4;
				break;
			default :
				empHours = 0;
			}
			empWage = EMP_RATE_PER_HOUR * empHours;
			totalEmpWage += empWage;
			System.out.println("Employee Wages: " +  empWage);
		}
		System.out.println("Employee's total monthly Wage: " + totalEmpWage );
	}
}
