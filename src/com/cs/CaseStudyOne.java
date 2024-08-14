package com.cs;
import java.util.*;
public class CaseStudyOne {

	public static void main(String[] args) {
		int var1,var2,var3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first variable");
		var1= sc.nextInt();
		System.out.println("Enter second variable");
		var2= sc.nextInt();
		System.out.println("Enter third variable");
		var3= sc.nextInt();
		
		if(var1>var2) {
			if(var1>var3) {
				System.out.println("The largest of the three is "+ var1);
			}
			else {
				System.out.println("The largest of the three is "+ var3);
			}
		}
		else if(var2>var1) {
			if (var2>var3) {
				System.out.println("The largest of the three is "+ var2);
			}
			else {
				System.out.println("The largest of the three is "+ var3);
			}
		}
		else {
			if(var3<var1) {
				System.out.println("Both "+var1+" and "+ var2+" are equal and larger than "+var3);
				
			}
			else {
				System.out.println("Both "+var1+" and "+ var2+" are equal and smaller than "+var3);
			}
		}
		
		sc.close();

	}

}
