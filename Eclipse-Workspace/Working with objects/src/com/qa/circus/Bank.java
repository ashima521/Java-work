package com.qa.circus;

public class Bank {

public static void main(String[] args){
	BankAccount chris = new BankAccount();
	chris.addmoney(10);	
    System.out.println(chris.getBalance());		
}}
