class SavingsAccount {
    private static double annualInterestRate; // Annual interest rate for all accounts
    private double savingsBalance;           // Individual savings balance

    // Constructor
    public SavingsAccount(double balance) {
        this.savingsBalance = balance;
    }

    // Method to calculate and add monthly interest
    public void calculateMonthlyInterest() {
        double interest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += interest;
    }

    // Method to get the current balance
    public double getSavingsBalance() {
        return savingsBalance;
    }

    // Static method to modify the annual interest rate
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
}
public class SavingAccountTest_2 {
    public static void main(String[] args) {
        // Create two savings account objects
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);

        // Calculate and display monthly interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver1 balance after 4%% interest: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance after 4%% interest: Rs %.2f%n", saver2.getSavingsBalance());

        // Set annual interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        // Calculate and display next month's interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("Saver1 balance after 5%% interest: Rs %.2f%n", saver1.getSavingsBalance());
        System.out.printf("Saver2 balance after 5%% interest: Rs %.2f%n", saver2.getSavingsBalance());
    }
}
