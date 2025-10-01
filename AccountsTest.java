package bank.com;

public class AccountsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account myAccount = new Account("John Doe", 500.0);

		System.out.println("Initial Balance: $" + myAccount.getBalance());

		myAccount.deposit(200.0);
		System.out.println("Balance after deposit: $" + myAccount.getBalance());

		myAccount.withdraw(100.0);
		System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

		myAccount.withdraw(700.0); // Should trigger warning
		System.out.println("Final Balance: $" + myAccount.getBalance());

	}

}
