public class BankAccountTester
{

public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", "John Doe", 1000.0, 750, true);

        account.displayDetails();
        System.out.println("Checking debit card: " + account.checkDebitCard());
        System.out.println("CIBIL Score: " + account.getCibilScore());

        account.withdrawIfMatched("123456789", "John Doe", 500.0);
        account.withdrawIfMatched("123456789", "John Doe", 500.0);
        account.withdrawIfMatched("123456789", "John Doe", 1.0);
    }
}