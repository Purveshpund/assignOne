package assingmentEmp;
// this usecase is to solve using Switch Case Statement
public class EmpWageBuilderUC4 {
	public static void main(String[] args) {
		
		// Class Members(Constants)
		final int IS_PART_TIME = 1;
		final int IS_FULL_TIME = 2;
		final int EMP_RATE_PER_HOUR = 20; //USD
		
		// Class Members(variables)
		int empHours = 0;
		int empWage = 0;
		
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 3;
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
		System.out.println("Employee Wage: " +  empWage);
	}
}
