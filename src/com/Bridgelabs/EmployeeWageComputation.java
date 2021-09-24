package com.Bridgelabs;

public class EmployeeWageComputation {
	
		public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMPLOYEE_RATE_PER_HOURS =20;
		public static final int NUMBER_OF_WORKING_DAYS = 20;
		public static final int MAXIMUM_HRS_IN_MONTH = 100;
	
		
		public static void main(String arsg[]) {
			System.out.println("**Welcome to the employee wage computation program**");
			computeEmployeeWage();
		}
		
		//creating method
		public static int computeEmployeeWage() {
			
			//local Variable
			int employeeHours = 0;
			int totalEmployeeHours = 0;
			int totalWorkingDays = 0;
        
			//using while loop for iteration
			while (totalEmployeeHours <= MAXIMUM_HRS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
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
        
			int totalEmployeeWage = totalEmployeeHours * EMPLOYEE_RATE_PER_HOURS;
			System.out.println("Total Employee Wage: " + totalEmployeeWage);
			return totalEmployeeWage;
		}
		
}