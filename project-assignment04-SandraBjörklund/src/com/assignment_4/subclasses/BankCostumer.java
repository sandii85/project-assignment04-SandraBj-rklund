package com.assignment_4.subclasses;

import java.util.ArrayList; 

import com.assignment_4.superclasses.BankAccount;
import com.assignment_4.superclasses.Human;


public class BankCostumer extends Human {

 ArrayList<BankAccount> costumerAccounts = new ArrayList<BankAccount>();
	public BankCostumer(String name, int age) {
		super(name, age);
	}

	public void setCostumerAccounts(ArrayList<BankAccount> costumerAccounts) {
		this.costumerAccounts = costumerAccounts;
	}
	public ArrayList<BankAccount> getCostumerAccounts() {
		return costumerAccounts;
	}

	public void addAccount(BankAccount bankAccount) {
		costumerAccounts.add(bankAccount);
	}
	
	public void depositToAccount(String accountNumber, double amount) {
		for (int i = 0; i < costumerAccounts.size(); i++) {
			if (costumerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				costumerAccounts.get(i).depositMoney(amount);
			}
		}

	}

	public void withdrawMoneyFromAccount(String accountNumber, double amount) {
		for (int i = 0; i < costumerAccounts.size(); i++) {
			if (costumerAccounts.get(i).getAccountNumber().equals(accountNumber)) {
				costumerAccounts.get(i).withdrawMoney(amount);
			}
		}
	}

	@Override
	public String toString() {
		return "Costumer: Name " + getName() + " Age " + getAge()
				+ "\n" + "CostumerAccount " + costumerAccounts.get(0)+ "\n"+ costumerAccounts.get(1)+ "\n"+ costumerAccounts.get(2)+ "\n"
				 + "]";
	}
	
	

}
	


	
	
	
	
	
	
	

	
