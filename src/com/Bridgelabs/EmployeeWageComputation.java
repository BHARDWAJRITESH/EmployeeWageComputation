package com.Bridgelabs;

public class EmployeeWageComputation {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
	
		
		public static void main(String arsg[]) {
			System.out.println("**Welcome to the employee wage computation program**");
			computeEmployeeWage("SoftwareOne", 410, 20, 100);
			computeEmployeeWage("Infosys", 860, 20, 120);
		}
		
		//creating method
		public static int computeEmployeeWage(String companyName, int employeeRatePerHours, int numberOfWorkingDays, int maximumHoursPerMonth) {
			
			//local Variable
			int employeeHours = 0;
			int totalEmployeeHours = 0;
			int totalWorkingDays = 0;
        
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
				System.out.println("Day#: " + totalWorkingDays + " Employee Hour: " +employeeHours);
		
			}
        
			int totalEmployeeWage = totalEmployeeHours * employeeRatePerHours ;
			System.out.println("Total Employee Wage for company " + companyName+ " is:" + totalEmployeeWage);
			return totalEmployeeWage;
		}
		
}