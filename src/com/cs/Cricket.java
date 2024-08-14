package com.cs;

import java.util.Scanner;

class Score{
	int totalscore;
	
	public void six() {
		totalscore+=6;
	}
	public void four() {
		totalscore+=4;
	}
	public void single() {
		totalscore+=1;
	}
	
	public void displayscore() {
		System.out.println("Score: "+ totalscore);
	}
}


public class Cricket {

	public static void main(String[] args) {
		 Score sc= new Score();
		 int runs;
		 char ch='y';
		 Scanner scan= new Scanner(System.in);
		 while(true) {
			System.out.println("Enter runs scored on this ball");
			runs=scan.nextInt();
			switch(runs) {
			case 1:
				sc.single();
				break;
			case 2:
				for(int i=0;i<2;i++) {
					sc.single();
				}
				break;
			case 3:
				for(int i=0;i<3;i++) {
					sc.single();
				}
				break;
			case 4:
				sc.four();
				break;
			case 6:
				sc.six();
				break;
			default:
				System.out.println("Wrong entry");
			}
			System.out.println("Next ball?");
			ch=scan.next().charAt(0);
			if(ch=='n')
				break;
		 }
		 sc.displayscore();
	}

}
