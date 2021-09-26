package com.Bridgelabs;

public class EmployeeWageComputation {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		private int numberOfCompany = 0;
		private CompanyEmployeeWage[] companyEmployeeWageArray;
		
		public EmployeeWageComputation() {
			companyEmployeeWageArray = new CompanyEmployeeWage[5];
		}
		
		
		private void addCompanyEmployeeWage(String companyName, int employeeRatePerHours, int numberOfWorkingDays, int maximumHoursPerMonth) {
			companyEmployeeWageArray[numberOfCompany] = new CompanyEmployeeWage(companyName, employeeRatePerHours, numberOfWorkingDays, maximumHoursPerMonth);
			
         numberOfCompany++;
		}
		
		public void computeEmployeeWage() {
			for (int i = 0; i < numberOfCompany; i++) {
				companyEmployeeWageArray[i].setTotalEmployeeWage(this.computeEmployeeWage(companyEmployeeWageArray[i]));
				System.out.println(companyEmployeeWageArray[i]);
			}
		}
		private int computeEmployeeWage(CompanyEmployeeWage companyEmployeeWage) {
			
			int employeeHours =0, totalEmployeeHours =0, totalWorkingDays = 0;	
			
			//using while loop for iteration
				while (totalEmployeeHours <= companyEmployeeWage.maximumHoursPerMonth && totalWorkingDays < companyEmployeeWage.numberOfWorkingDays) {
					totalWorkingDays++;
					int employeeCheck =(int) Math.floor(Math.random() * 10) % 3;
				
				//using switch case
					switch  (employeeCheck) {
						case IS_FULL_TIME:
							employeeHours=8;
							break;
						case IS_PART_TIME:
							employeeHours =4;
							break;
						default:
							employeeHours=0;
					}
			
		
				totalEmployeeHours += employeeHours;
				System.out.println("Day#: " + totalWorkingDays + " Employee Daily Working Hour: " +employeeHours);
		
				}
				return totalEmployeeHours * companyEmployeeWage.employeeRatePerHours;
		}
			
			public static void main(String arsg[]) {
			
			System.out.println("**********************************************************\nWelcome to the employee wage computation program\n**********************************************************");
			EmployeeWageComputation employeeWageBuilder = new EmployeeWageComputation();
			employeeWageBuilder.addCompanyEmployeeWage("Infosys",1200,10,100);
			employeeWageBuilder.addCompanyEmployeeWage("SoftwareOne",1000,10,100);
			employeeWageBuilder.computeEmployeeWage();
		
			}	
}