class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private String password;

    public BankAccount(String accountHolder, int accountNumber, double initialBalance, String password) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.password = password;
    }

    public void balanceEnquiry() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs. " + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) throw new NegativeNumberException("Deposit amount cannot be negative.");
        balance += amount;
        System.out.println("Deposited: Rs. " + amount);
    }

    public void withdraw(double amount, String enteredPassword) throws LowBalanceException, NegativeNumberException, PasswordMismatchException {
        if (!password.equals(enteredPassword)) throw new PasswordMismatchException("Password mismatch.");
        if (amount < 0) throw new NegativeNumberException("Withdraw amount cannot be negative.");
        if (amount > balance) throw new LowBalanceException("Insufficient funds.");
        balance -= amount;
        System.out.println("Withdrawn: Rs. " + amount);
    }

    public void transfer(BankAccount target, double amount, String enteredPassword) throws LowBalanceException, NegativeNumberException, PasswordMismatchException {
        if (!password.equals(enteredPassword)) throw new PasswordMismatchException("Password mismatch.");
        if (amount < 0) throw new NegativeNumberException("Transfer amount cannot be negative.");
        if (amount > balance) throw new LowBalanceException("Insufficient funds.");
        balance -= amount;
        target.balance += amount;
        System.out.println("Transferred Rs. " + amount + " to " + target.accountHolder);
    }
}
public class BankAccountTest_7 {
    // Test class for BankAccount
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = new BankAccount("Alice", 101, 5000.0, "pass123");
        accounts[1] = new BankAccount("Bob", 102, 3000.0, "secure456");

        try {
            accounts[0].deposit(1000);
            accounts[0].balanceEnquiry();

            accounts[0].withdraw(1500, "pass123");
            accounts[0].balanceEnquiry();

            accounts[0].transfer(accounts[1], 2000, "pass123");

            accounts[1].balanceEnquiry();
        } catch (LowBalanceException | NegativeNumberException | PasswordMismatchException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
