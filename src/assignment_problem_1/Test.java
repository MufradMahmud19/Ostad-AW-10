package assignment_problem_1;

public class Test {
	public static void main(String [] args) {
		SavingsAccount sA=new SavingsAccount("Mufrad Mahmud","Muf19", 1000, 500); // userAccount, accountNumber, accountBalance, withdrawalLimit
		CheckingAmount cA=new CheckingAmount("Mufrad Mahmud", "Muf19", 1000); // userAccount, accountNumber, accountBalance
		
		sA.deposit(400); // 1000+400=1400
		sA.withdraw(700); // withdrawal limit error message "Amount exceeds withdrawal Limit" show
		sA.withdraw(200); // 1400-200=1200
		
		System.out.println("----------------------------------------------------------------------");
		
		cA.deposit(300); //1000+300=1300
		cA.withdraw(100); //1300-(100+50)=1150, transaction fee 50 cut
		cA.withdraw(5000); // withdrawal limit error message "Insufficient amount to cover withdrawal and fee" show
		System.out.println("----------------------------------------------------------------------");
	}
}
