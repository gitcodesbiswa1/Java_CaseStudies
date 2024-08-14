package com.cs;

import java.util.Scanner;

class CarRunning
{
	int acc,speed,time;
	Scanner sc= new Scanner(System.in);
	public void start() {
		System.out.println("Engine is on");
	}
	public void accelerate() {
		System.out.println("Press the pedal");
		System.out.println("Acceleration = ");
		acc=sc.nextInt();
		System.out.println("For how much time did you press the pedal");
		time=sc.nextInt();
		speed+=(acc*time);
	}
	public void speed() {
		System.out.println("Car is running at a speed of: "+ speed+" km/h");
	}
	public void stop() {
		System.out.println("Engine stopped");
	}
	
}
public class Car {
	static int regno;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter vehicle registraton number");
		regno=sc.nextInt();
		System.out.println("Vehicle regno "+ regno);
		CarRunning cr= new CarRunning();
		cr.start();
		cr.accelerate();
		cr.speed();
		char ch='n';
		
		System.out.println("Do you want to end trip");
		ch=sc.next().charAt(0);
		if(ch=='y')
			cr.stop();

	}

}
