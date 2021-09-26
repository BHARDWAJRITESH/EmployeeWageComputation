package com.Bridgelabs;

public class CompanyEmployeeWage {
	public final String companyName;
	public final int employeeRatePerHours;
	public final int numberOfWorkingDays;
	public final int maximumHoursPerMonth;
	public int totalEmployeeWage;
	
	public CompanyEmployeeWage(String companyName, int employeeRatePerHours, int numberOfWorkingDays, int maximumHoursPerMonth) {
	
		this.companyName = companyName;
		this.employeeRatePerHours = employeeRatePerHours;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}
	
		public void setTotalEmployeeWage(int totalEmployeeWage) {
			this.totalEmployeeWage = totalEmployeeWage;
		}
		
		public String toString() {
			return "********************************************************************************************\nTotal employee wage for company: " +companyName+ "is:" + totalEmployeeWage +"\n********************************************************************************************"; 
		}
	

}
