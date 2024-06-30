package assignment_problem_1;

public class SavingsAccount extends BankAccount{
	int withdrawalLimit;
	
	SavingsAccount(String userAccount, String accountNumber, int accountBalance, int withdrawalLimit){
		super(userAccount, accountNumber, accountBalance);
		this.withdrawalLimit=withdrawalLimit;
	}
	
	@Override
	void withdraw(int amount) {
		if(amount > withdrawalLimit) {
			System.out.println("Amount exceeds withdrawal Limit");
			System.out.println();
		} else {
			super.withdraw(amount);
		}
		
	}
}
