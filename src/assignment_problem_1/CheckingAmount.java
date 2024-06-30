package assignment_problem_1;

public class CheckingAmount extends BankAccount{
	double transactionFee=50; //Setting transaction fee ৳ 50 
	
	CheckingAmount(String userAccount, String accountNumber, int accountBalance){
		super(userAccount, accountNumber, accountBalance);
		//this.transactionFee=transactionFee;
	}
	
	@Override
	void withdraw(int amount) {
		double finalAmount=amount+transactionFee;
		
		if(finalAmount>accountBalance) {
			System.out.println("Insufficient amounts to cover withdrawal and transaction fee");
			System.out.println();
		} else {
			accountBalance-=finalAmount;
			System.out.println("Withdrawn: ৳"+amount+" with transaction fee: ৳"+transactionFee);
            System.out.println("Current Balance: ৳" + accountBalance);
            System.out.println();
		}

	}
}
