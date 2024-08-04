package org.bank;

public class BankInfo extends Axisbank {

	public void saving() {
		System.out.println("Savings");
	}

	public void fixed() {
		System.out.println("fixed");
	}

	public static void main(String[] args) {
		BankInfo objBank = new BankInfo();
		objBank.saving();
		objBank.fixed();
		objBank.deposit();
	}
}

