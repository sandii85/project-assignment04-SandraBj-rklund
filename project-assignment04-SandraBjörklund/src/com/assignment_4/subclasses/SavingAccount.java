package com.assignment_4.subclasses;

import java.util.UUID;

import com.assignment_4.superclasses.BankAccount;
/*allt med getters och setters är medärvt. här behövs endast konstruktorn för att kunna hämta metoderna för att kunna fylla 
värdena i main*/
public class SavingAccount extends BankAccount{
	
	public SavingAccount() {
		/*detta är inga attribut.. detta är metoder som hämtas från klassen BankAccount. därför paranteser som inparametrar 
		och inga likamed tecken.... den läser in*/
		this.setAccountNumber(UUID.randomUUID().toString().substring(0,6));
		this.setBalance(0.0);
		this.setAccountType("SavingAccount");
	}

}


/*man kan dela in alla sub och superklasser och interfaces i paket för att ha en bra ordning i biblioteket.
paketen är ungefär som kapitel eller filer i en bok och projektet är själva boken.*/