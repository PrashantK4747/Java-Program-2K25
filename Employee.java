/*Create a class called Employee that includes three pieces of information as instance variables- 
first name, a last name and a monthly salary. Your class should have a constructor that initializes the three instance 
variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. 
Write a test application named EmployeeTest that demonstrates class Employee's capabilities. Create two Employee 
objects and display each object's yearly salary. Then give each Employee a 10% raise and display each Employee's 
yearly salary again.  */


// Class to store and handle employee information
class EmpInfo {
	private String firstName;      // First name of the employee
	private String lastName;       // Last name of the employee
	private double monthlySalary;  // Monthly salary of the employee
	private double annualSalary;   // Annual salary of the employee
	
	// Constructor to initialize employee data
	EmpInfo(String firstName, String lastName, double monthlySalary){
		this.firstName = firstName;     // Assigning first name
		this.lastName = lastName;       // Assigning last name
		
		// Check if salary is negative, if yes set to 0
		if(monthlySalary < 0){
			this.monthlySalary = 0;
		}
		else {
			this.monthlySalary = monthlySalary;
		}
	}
	
	// Method to get the first name
	public String getFirstName(){
		return firstName;
	}
	
	// Method to get the last name
	public String getLastName(){
		return lastName;
	}
	
	// Method to get the monthly salary
	public double getMonthlySalary(){
		return monthlySalary;
	}
	
	// Method to calculate and return annual salary
	public double getAnnualSalary(){
		return annualSalary = 12 * monthlySalary; // Annual = 12 x monthly
	}
	
	// Method to calculate and return monthly salary after 10% hike
	public double afterHikeMonthlySalary(){
		return (monthlySalary + monthlySalary * 0.1); // 10% hike
	}
	
	// Method to calculate and return annual salary after 10% hike
	public double afterHikeAnnualSalary(){
		return (annualSalary + annualSalary * 0.1); // 10% hike on annual
	}
}

// Main class to execute the program
public class Employee {
	public static void main (String[] args){
		
		// Creating first employee object
		EmpInfo e1 = new EmpInfo("Prashant", "Kale", 50000);
		
		// Creating second employee object
		EmpInfo e2 = new EmpInfo("Aditya", "Mulik", 100000);
		
		// Displaying details for employee 1
		System.out.println("Name: " + e1.getFirstName() + " " + e1.getLastName());
		System.out.println("Monthly Salary: " + e1.getMonthlySalary());
		System.out.println("Annual Salary: " + e1.getAnnualSalary());
		System.out.println("Monthly Salary After Hike: " + e1.afterHikeMonthlySalary());
		System.out.println("Annual Salary After Hike: " + e1.afterHikeAnnualSalary());
		System.out.println(); // For better readability
		
		// Displaying details for employee 2
		System.out.println("Name: " + e2.getFirstName() + " " + e2.getLastName());
		System.out.println("Monthly Salary: " + e2.getMonthlySalary());
		System.out.println("Annual Salary: " + e2.getAnnualSalary());
		System.out.println("Monthly Salary After Hike: " + e2.afterHikeMonthlySalary());
		System.out.println("Annual Salary After Hike: " + e2.afterHikeAnnualSalary());
	}
}