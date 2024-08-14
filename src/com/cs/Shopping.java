package com.cs;

public class Shopping extends Amazon{
	public void addProduct() {
		System.out.println("Tshirts added to cart successfully");
	}
	public void Payment() {
		System.out.println("Kindly pay 5000 rupees at checkout");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shopping sg= new Shopping();
		sg.Login();
		sg.search();
		sg.addProduct();
		sg.Payment();
		sg.returnItems();

	}

}
