package com.codegnan.oopexamples;

import java.util.Scanner;

public class BankAccount {
	Scanner sc=new Scanner(System.in);
	private String accountHolder;
	private int accountNumber;
	private double balance;
	
	public void setHolder(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	public String getHolder() {
		return accountHolder;
	}
	public void setNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	public int getNumber() {
		return accountNumber;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getbalance() {
		return balance;
	}
	
	public void createAccount() {
		System.out.println("Account Holder : "+accountHolder+" Account Number : "+accountNumber);
	}
	public void deposit() {
		System.out.println("Enter Deposit Amount: ");
		double depositAmount=sc.nextDouble();
		if(depositAmount%100!=0) {
			System.out.println("Please Deposite Multiples of Hundreds" +  "like[700,1000,2000");
		}else {
			if(depositAmount<500) {
				System.out.println("Please deposit More than 500 rupees");
			}else {
				balance+=depositAmount;
				System.out.println("Deposited: " + depositAmount+ "Amount Succesfully Deposited. New balance:" +balance);
			}
		}
	}
	public void withDraw() {
		
		System.out.println("Enter Withdraw Amount: ");
		double withhdrawAmount=sc.nextDouble();
		if(withhdrawAmount%100!=0) {
			System.out.println("Please withhdraw Multiples of Hundreds" +  "like[700,1000,2000]");
		}else {
			if(withhdrawAmount<500) {
				System.out.println("Please deposit More than 500 rupees");
			}else {
				if(withhdrawAmount>balance) {
					System.out.println("Insufficient Funds");
				}else {
					balance-=withhdrawAmount;
					System.out.println("Amount withdrawn succesfully." +withhdrawAmount +" New Balance" +balance);
				}
			}
		}	
	}
}

