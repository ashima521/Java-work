package com.qa.circus;

public class BankAccount {
    private int balance = 10;
	public void addmoney(int money) {
		//authenciate() in order to limit access
		this.balance = this.balance + money;
		}
	public int getBalance() {
		return this.balance;
		}
	public void setBalance(int balance) {
		this.balance= balance;
		}}