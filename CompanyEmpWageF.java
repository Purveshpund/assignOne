
package assingmentEmp;
// this is the final version.

public class CompanyEmpWageF {
			public final String company;
			public final int empRatePerHour;			
			public final int numOfWorkingDays;
			public final int maxHoursPerMonth;
			public int totalEmpWage;

			public CompanyEmpWageF (String company, int empRatePerHour,
					int numOfWorkingDays, int maxHoursPerMonth) {
				this.company = company ;
				this.empRatePerHour = empRatePerHour;
				this.numOfWorkingDays = numOfWorkingDays ;
				this.maxHoursPerMonth = maxHoursPerMonth ;
				totalEmpWage=0;
			}
			public void setTotalEmpWage(int totalEmpWage) {
				this.totalEmpWage = totalEmpWage;
			}
			
			@Override
			public String toString() {
				return "Total Emp Wage for Company : " +company+ " is : " + totalEmpWage;
			}
}
/*
public interface IComputeEmpWage {
	public void addCompanyEmpWage(String company, int empRatePerHour,
			int numOfWorkingDays, int maxHoursPerMonth);
	public void computeEmpwage();
	public int getTotalWage(String company);
}
*/