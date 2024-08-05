package AnudipPracticals;

import java.util.Scanner;

public class Account extends Customer {
	private int accountno;
	private double balance;
	private String customer;
	
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	
	//Method
	
	public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public double Balance() {
        return balance;
    }

    public String Customer() {
        return customer;
    }
  
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Enter customer name: ");
        account.setName(scanner.nextLine());

        System.out.print("Enter account number: ");
        account.setAccount(scanner.nextLine());

        System.out.print("Enter unique customer number: ");
        account.setNumber(scanner.nextInt());

        System.out.print("Enter initial balance: ");
        account.setBalance(scanner.nextDouble());

        account.setCustomer(account.getName());

        boolean exit = false;
        while (!exit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Customer Details");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    System.out.println("Current balance: " + account.getBalance());
                    break;

                case 4:
                    System.out.println("Customer Name: " + account.getCustomer());
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Unique Customer Number: " + account.getNumber());
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

    }
}
	

