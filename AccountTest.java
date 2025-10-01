package bankingapp;

public class AccountTest {
    public static void main(String[] args) {
        Account acc1 = new Account("Lee&Marshy", 1000.0);

        acc1.deposit(20000.0);      
        acc1.withdraw(600.0);     
        acc1.withdraw(2000.0);    
        System.out.println("Final Balance: " + acc1.getBalance());
    }
}


