package com.Bridgelabs;

public class EmployeeWageComputation {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		private final String companyName;
		private final int employeeRatePerHours;
		private final int numberOfWorkingDays;
		private final int maximumHoursPerMonth;
		private int totalEmployeeWage;
		
		
		//creating constructor
		public EmployeeWageComputation(String companyName, int employeeRatePerHours, int numberOfWorkingDays, int maximumHoursPerMonth) {
			
			this.companyName = companyName;
			this.employeeRatePerHours = employeeRatePerHours;
			this.numberOfWorkingDays = numberOfWorkingDays;
			this.maximumHoursPerMonth = maximumHoursPerMonth;
		}
		
		public void computeEmployeeWage() {
			
			int employeeHours =0, totalEmployeeHours =0, totalWorkingDays = 0;	
			
			//using while loop for iteration
				while (totalEmployeeHours <= maximumHoursPerMonth && totalWorkingDays < numberOfWorkingDays) {
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
				totalEmployeeWage = totalEmployeeHours * employeeRatePerHours;
		}
		
			public String toString(){
			return "Total employee wage for company" +companyName+ " is:" + totalEmployeeWage;
			}
			
			public static void main(String arsg[]) {
			
			System.out.println("**********************************************************\nWelcome to the employee wage computation program\n**********************************************************");
			EmployeeWageComputation softwareOne = new EmployeeWageComputation("SoftwareOne",1100,10,100);
			EmployeeWageComputation infosys = new EmployeeWageComputation("Infosys",1200,10,100);
			
			softwareOne.computeEmployeeWage();
			System.out.println("*********************************************************\n"+softwareOne+"\n*********************************************************");
			infosys.computeEmployeeWage();
			System.out.println("***********************************************************\n"+infosys+"\n***********************************************************");
			
			}	
}