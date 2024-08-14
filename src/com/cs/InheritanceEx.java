package com.cs;

class Super {
  int i,j;
   Super(){
	 i=10;
	 j=20;
  }
}

public class InheritanceEx extends Super{
	int k;
	InheritanceEx(){
		k=40;
	}
	
	public void add() {
		int sum=i+j+k;
		System.out.println("Sum is= "+sum);
	}
	public static void main(String[] args) {
		InheritanceEx ob= new InheritanceEx();
		ob.i=60;
		ob.j=100;
		ob.add();
	}
}
