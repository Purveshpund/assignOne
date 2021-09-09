package assingmentEmp;
// this usecase is to Calculate Wages till a condition of total working hours or days is reached for a month
// Assuming 100 hour and 20 days are the caps
public class EmpWageBuilderUC6 {
			//Constants
			public static final int IS_PART_TIME = 1;
			public static final int IS_FULL_TIME = 2;
			public static final int EMP_RATE_PER_HOUR = 20; //USD
			public static final int NUM_OF_WORKING_DAYS = 25;
			public static final int MAX_NUM_HOUR = 100;

	public static void main(String[] args) {
		// Class Members(variables)
		 int totalEmpWage = 0;
		int totalEmpHour = 0; int totalEmpDay = 0;
		
		//Computation
		while (totalEmpHour <= MAX_NUM_HOUR && totalEmpDay <= NUM_OF_WORKING_DAYS) {
			int empHours = 0; int empWage = 0;
			totalEmpDay ++;
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
			totalEmpHour += empHours;
			empWage = EMP_RATE_PER_HOUR * empHours;
			totalEmpWage += empWage;
			System.out.println("Employee Wages: " +  empWage);
		}
		System.out.println("Employee's total monthly Wage: " + totalEmpWage );
	}
}
