class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        setMonthlySalary(monthlySalary);
    }

    // Setters and Getters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void giveRaise(double percent) {
        monthlySalary += monthlySalary * (percent / 100);
    }
}
public class EmployeeTest_1 {
    public static void main(String[] args) {
        // Create two Employee objects
        Employee emp1 = new Employee("Alice", "Johnson", 3000);
        Employee emp2 = new Employee("Bob", "Smith", 4000);

        // Display yearly salaries
        System.out.println("yeraly salary:"+ emp1.getFirstName() +emp1.getLastName() +emp1.getYearlySalary());
        System.out.println("yeraly salary:"+emp2.getFirstName() +emp2.getLastName() +emp2.getYearlySalary());

        // Give 10% raise
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Display updated yearly salaries
        System.out.println("\nAfter 10% raise:");
        System.out.printf("%s %s yearly salary: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%s %s yearly salary: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}
