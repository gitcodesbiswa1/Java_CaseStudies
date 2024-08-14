package com.cs;

import java.util.Scanner;

public class CaseStudyThree {

	public static void main(String[] args) {
		int var,absvar;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value");
		var= sc.nextInt();
		
		absvar=Math.abs(var);
		System.out.println("absolute value of the entered value is "+ absvar);
		sc.close();
	}

}
