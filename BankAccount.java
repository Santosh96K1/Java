public class BankAccount {
    public static String accountNumber;
    public static  String accountHolderName;
    public static  double balance;
    public static  int cibilScore;
    public static  boolean isDebitCardActive;

    
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance, int cibilScore, boolean isDebitCardActive) {
        BankAccount.accountNumber = accountNumber;
        BankAccount.accountHolderName = accountHolderName;
        BankAccount.balance = initialBalance;
        BankAccount.cibilScore = cibilScore;
        BankAccount.isDebitCardActive = isDebitCardActive;
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
        if (BankAccount.accountNumber.equals(accNumber) && BankAccount.accountHolderName.equals(accHolderName)) {
            withdrawAmount(amount);
        } else {
            System.out.println("Account details do not match.");
        }
    }

    
}
