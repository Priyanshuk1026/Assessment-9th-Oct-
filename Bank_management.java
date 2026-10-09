import java.util.*;
public class Bank_management {
	private String accountholder;
	private String accountnumber;
	private double balance;
	public Bank_management(String accountholder, String accountnumber, double balance) {
		
		if(balance< 0) {
			throw new IllegalArgumentException("balance can't be less than zero. ");
		}
		this.accountholder = accountholder;
		this.accountnumber = accountnumber;
		this.balance = balance;
		
	}
	public void deposit(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("Amount can't be less than zero. ");
		}
		balance +=amount;
		System.out.println("Updated balance after deposit: " + balance);
		
	}
	public void withdraw(double amount) {
		if(amount<=0) {
			throw new IllegalArgumentException("Amount must be greater than zero ");
		}
		if(amount>balance) {
			throw new IllegalArgumentException("Insufficient balance ");
		}
		balance -=amount;
	    System.out.println("Updated balance after withdraw: " + balance);
	}
	public void checkbalance() {
	    System.out.println("Available balance: " + balance);
	}
	
	public void display() {
		System.out.println("Account Holder name: " + accountholder);
		System.out.println("Account Holder number: " + accountnumber);
		System.out.println("Account Balance: " + balance);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Bank_management account = null;
		System.out.println("Create bank Account. ");
		System.out.println("Account Holder name ");
		String name = sc.nextLine();
		if(name.isEmpty()) {
			throw new IllegalArgumentException("Account holder name is empty ");
		}
		
		System.out.println("Account Holder number ");
		String accountnumber = sc.nextLine();
		if(accountnumber.isEmpty()) {
			throw new IllegalArgumentException("Account holder number is empty ");
		}
		System.out.println("Initial balance ");
		double balance = sc.nextDouble();
		account = new Bank_management(name, accountnumber, balance);

		int choice =0;
		do {
			try {
			System.out.println("Enter choice");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				double depositAmount = sc.nextDouble();
				 account.deposit(depositAmount);
                 break;
               
			case 2:
				double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;
                
			case 3:
				account.checkbalance();
                break;
                
			case 4: 
				account.display();
				break;
				
			case 5:
				System.out.println("exit");
		
			default:
				System.out.println("Invalid choice. ");
			}
		  }
			catch (IllegalArgumentException e) {
		        System.out.println("Transaction failed: " + e.getMessage());
		     }
	   	}
		while(choice!=5);
		sc.close();	
	}
}

