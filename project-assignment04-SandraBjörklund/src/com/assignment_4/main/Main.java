package com.assignment_4.main;


import com.assignment_4.subclasses.PersonalAccount;
import com.assignment_4.subclasses.SavingAccount;
import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.subclasses.BankCostumer;


public class Main {

	public static void main(String[] args) {
		
		String account="";
		
		BankCostumer bc = new BankCostumer ("Sandra",32);
		bc.addAccount(new BankAccount());
		bc.addAccount(new PersonalAccount());
		bc.addAccount(new SavingAccount());
		System.out.println(bc.toString());
		
		System.out.println("Depositing 30.0 to the first account");
		account = bc.getCostumerAccounts().get(0).getAccountNumber();
		bc.depositToAccount(account, 30.0);
		System.out.println(bc.toString());
		
		System.out.println("Withdraw 200.0 to the first account");
		account = bc.getCostumerAccounts().get(1).getAccountNumber();
		bc.withdrawMoneyFromAccount(account, 200.0);
		System.out.println(bc.toString());
		
		System.out.println("Depositing 200.0 to the first account");
		account = bc.getCostumerAccounts().get(2).getAccountNumber();
		bc.depositToAccount(account, 200.0);
		System.out.println(bc.toString());

	}

}