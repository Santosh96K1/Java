public class SbiTester
{
    public static void main(String[] args) 
	{
        Sbi.accountHolderName="santosh";
        Sbi.accountNumer=123;
        Sbi.cibilScore=1234;
        Sbi.checkDebitCard=true;
        Sbi.withDrawAmount=1000;
        Sbi.balance=2000;
		Sbi.display();
        System.out.println(Bank.getCibilScore());

       if(Sbi.withDrawAmount<Sbi.balance) 
	   {
        System.out.println("youre allowed to withdraw");
       }
       else
	   {
        System.out.println("youre not allowed to withdraw");
       }
	   
	   
       if(Sbi.withDrawAmount==Sbi.balance)
	   {
        System.out.println("maintain  sufficient balance");
       }
       Sbi.display();
       System.out.println(Bank.getCibilScore());
    }
     
 }