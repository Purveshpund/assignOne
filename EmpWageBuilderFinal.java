
package assingmentEmp;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

// this is first half of UC10, second half of UC10 is CompanyEmpWage
public class EmpWageBuilderFinal implements IComputeEmpWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	
	//private CompanyEmpWage[] companyEmpWageArray;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	
	public EmpWageBuilderFinal() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}
	
	public void addCompanyEmpWage (String company, int empRatePerHour,
			int numOfWorkingDays, int maxHoursPerMonth ){
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}


	public int getTotalWage(String company){
		return companyToEmpWageMap.get(company).totalEmpWage;
	}
	
	@Override
	public void computeEmpwage() {
		for (int i = 0; i < companyEmpWageList.size();i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}// TODO Auto-generated method stub
		
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		
		//Variables
		int empHrs=0, totalEmpHrs = 0, totalWorkingDays = 0;
		
		//Computation
		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && 
				totalWorkingDays < companyEmpWage.numOfWorkingDays) {
		
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random()*10)%3);
			switch (empCheck) {
			case IS_PART_TIME-> empHrs=4;
			case IS_FULL_TIME-> empHrs=8;
			default -> empHrs=0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+ totalWorkingDays + "Emp Hr: " + empHrs);
			}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args){
		IComputeEmpWage empWageBuilder = new EmpWageBuilderFinal();
		empWageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
		empWageBuilder.addCompanyEmpWage("Reliance", 10, 4,20);
		empWageBuilder.computeEmpwage();
		System.out.println("Total Wage For Dmart Company: " + empWageBuilder.getTotalWage("DMart"));
		
	}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	