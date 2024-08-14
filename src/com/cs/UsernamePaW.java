package com.cs;
import java.util.Scanner;
public class UsernamePaW {

	public static void main(String[] args) {
		String username, inputUname, password, inputPW;
		
		username="Biswajit";
		password="SEP25";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter username");
		inputUname= sc.next();
		System.out.println("Enter password");
		inputPW= sc.next();
		
		if(inputUname.equals(username)) {
			if(inputPW.equals(password)) {
				System.out.println("Login successful");
			}
			else {
				System.out.println("Wrong username or password");
			}
		}
		else {
			System.out.println("wrong username or password");
		}
		
		sc.close();
	}

}
