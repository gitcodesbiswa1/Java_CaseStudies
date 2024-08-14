package com.cs;

import java.util.Scanner;

public class CaseStudyTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int var;
		System.out.println("Enter a value");
		var= sc.nextInt();
		if(var%2==0) {
			System.out.println("Entered value is even");
		}
		else {
			System.out.println("Entered value is odd");
		}
		sc.close();
	}

}
