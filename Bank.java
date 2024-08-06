public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private int cibilScore;
    private boolean isDebitCardActive;

    
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance, int cibilScore, boolean isDebitCardActive) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.cibilScore = cibilScore;
        this.isDebitCardActive = isDebitCardActive;
    }

    public boolean checkDebitCard() {
        return isDebitCardActive;
    }

    public void withdrawAmount(double amount) {
        if (amount < balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else if (amount == balance) {
            System.out.println("Withdrawal amount equals balance. Please maintain proper balance.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public int getCibilScore() {
        return cibilScore;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("CIBIL Score: " + cibilScore);
        System.out.println("Debit Card Active: " + isDebitCardActive);
    }

    public void withdrawIfMatched(String accNumber, String accHolderName, double amount) {
        if (this.accountNumber.equals(accNumber) && this.accountHolderName.equals(accHolderName)) {
            withdrawAmount(amount);
        } else {
            System.out.println("Account details do not match.");
        }
    }

    
}
