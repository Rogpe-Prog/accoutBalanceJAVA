package application;

import java.util.Scanner;

import entities.Account;



public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account account;		
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String accountHolder = sc.next();
		System.out.print("Is there an initial deposit (y/n)?: ");
		char initialDeposit = sc.next().charAt(0);
		
		if (initialDeposit == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			account = new Account(accountNumber, accountHolder, initialDepositValue);
		} else {
			account = new Account(accountNumber, accountHolder);
		}
		
		
		System.out.println(account.toString());
		System.out.println();
		System.out.print("Enter deposit value: ");
		double addDepositValue = sc.nextDouble();
		account.addBalance(addDepositValue);
		System.out.println();
		System.out.println(account.toString());
		System.out.println();
		System.out.print("Enter a whitdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdrawBalance(withdrawValue);
		System.out.println(account.toString());
		
		
		sc.close();
	}

}
