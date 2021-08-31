package assingmentEmp;

// this usecase is to check if the Employee is Present or Absent, using random for attendance check.

public class EmpWageBuilderUC1 {

	public static void main(String[] args) {
		
		// Class Members(Constants)
		int IS_FULL_TIME = 1;
		
		//Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME) 
			System.out.println("Employee is Present ");
		else 
			System.out.println("Employee is Absent ");
	}

}
