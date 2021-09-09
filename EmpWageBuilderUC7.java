package assingmentEmp;
// this usecase is to Refactor the code to write a class method to compute Emp wage
public class EmpWageBuilderUC7 {
			//Constants
			public static final int IS_PART_TIME = 1;
			public static final int IS_FULL_TIME = 2;
			public static final int EMP_RATE_PER_HOUR = 20; //USD
			public static final int NUM_OF_WORKING_DAYS = 25;
			public static final int MAX_NUM_HOUR = 100;

			public static int computeEmpWage() {
				// Class Members(variables)
				int empHours = 0; int totalEmpHour = 0;int totalEmpDay = 0;
				//Computation
				while (totalEmpHour <= MAX_NUM_HOUR && totalEmpDay <= NUM_OF_WORKING_DAYS) {
					
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
					System.out.println("Day#: " + totalEmpDay + "Emp hour: " + empHours);
				}
				int totalEmpWage = totalEmpHour * EMP_RATE_PER_HOUR ;
				System.out.println("Total Emp Wage :  " + totalEmpWage);
				return totalEmpWage;
			}	
			public static void main(String[] args) {
				computeEmpWage();
			}
}
