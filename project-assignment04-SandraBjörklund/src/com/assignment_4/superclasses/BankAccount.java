package com.assignment_4.superclasses;

import java.util.UUID;

import com.assignment_4.interfaces.BankOperations;

public class BankAccount {
	//variabler
	private String accountNumber="";
	private String accountType="";
	private double balance=0.0;
	
	//construktor utan inparameter... 
	public BankAccount(){
		//the body of the constructor{this.accountNumber= UU} ... allt inom måsvingarna är kroppen
		//UUID.randomUUID = ett random id som räknas ut
		this.accountNumber = UUID.randomUUID().toString().substring(0,6);
		this.balance= 0.0;
		this.accountType= ("BankAccount");
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//return...... "Bankaccount[accountNumber:"....   =string ...+ accountNumber.... = inläsning osv......
	public String toString() {
		return "BankAccount [accountNumber:" + accountNumber + ", accountType:" + accountType + ", balance:" + balance+"]";
	}
	
	//implementerade från bankOperations 
	public void withdrawMoney(double amount) {
		if (amount>=0) {
			setBalance(getBalance() -amount);
			}else {
				System.out.println("you cannot withdraw a negative amount of money from the account");
			}
		
	}
	//implementerad från bankOperations
	public void depositMoney(double amount) {
		if(amount>=0) {
			setBalance(getBalance() + amount);
		}else {
			System.out.println("you cannot deposit a negative amount of money to the account");
		}
		
	}
	
	
	

	

	

}
