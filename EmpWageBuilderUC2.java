package assingmentEmp;
// this usecase is to calculate Daily Employee Wage

public class EmpWageBuilderUC2 {

	public static void main(String[] args) {
		
		// Class Members(Constants)
		final int IS_FULL_TIME = 1;
		final int EMP_RATE_PER_HOUR = 20; //USD
		
		// Class Members(variables)
		int empHours = 0;
		int empWage = 0;
		
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) 
			empHours = 8;
		empWage = EMP_RATE_PER_HOUR * empHours;
		System.out.println("Employee Wage: " +  empWage);
	}
}
