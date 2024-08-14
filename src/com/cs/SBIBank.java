package com.cs;

public class SBIBank extends Bank{
	public void VehicleLoan() {
		System.out.println("You have taken 500 crore rupees for vehicle loan from SBI");
	}
	public void CreditcardLoan() {
		System.out.println("Your credit card due is pending");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ob1= new Bank();
		ob1.CreditcardLoan();
		ob1.PersonalLoan();
		ob1.PropertyLoan();
		ob1.HomeLoan();
		ob1.VehicleLoan();
		
		SBIBank ob= new SBIBank();
		ob.PropertyLoan();
		ob.PersonalLoan();
		ob.CreditcardLoan();
		ob.VehicleLoan();
		ob.HomeLoan();
	}

}
