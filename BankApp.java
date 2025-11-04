package com.codegnan.oopexamples;

public class BankApp {

	public static void main(String[] args) {
		BankAccount acc1=new BankAccount();
		acc1.setHolder("Roshita");
		acc1.setNumber(12345067);
		acc1.setBalance(50000);
		acc1.createAccount();
		acc1.deposit();
		acc1.withDraw();

	}

}
