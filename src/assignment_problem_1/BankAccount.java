package assignment_problem_1;

public class BankAccount {
	
	String userAccount;
	String accountNumber;
	int accountBalance;
	
	BankAccount(String userAccount, String accountNumber, int accountBalance){
		this.userAccount=userAccount;
		this.accountNumber=accountNumber;
		this.accountBalance=accountBalance;
	}
	
	void deposit(int amount) {
		accountBalance+=amount; //The current deposited amount will get summed with the accountBalance
		System.out.println("Deposited: ৳"+amount);
        System.out.println("Current Balance: ৳"+accountBalance);
        System.out.println();
	}
	void withdraw(int amount) {
		if(amount>accountBalance) {
			System.out.println("Insufficient Account Balance");
			System.out.println();
		} else {
			accountBalance-=amount; //The current withdrawal amount will get subtracted from the accountBalance
			System.out.println("Withdrawn: ৳"+amount);
            System.out.println("Current Balance: ৳"+accountBalance);
            System.out.println();
		}
	}
}
