package com.to.Inheritance;

import java.util.Scanner;

public class Test1 extends Test {
	static Scanner sc= new Scanner(System.in);
	void Drive(){
		System.out.println("u have called from Test1");
	}
	 void Add(){
		int c,d;
		
		System.out.println("enter a:");
		c= sc.nextInt();
		
		System.out.println("enter b:");
		d= sc.nextInt();
		System.out.println("sum of the numbers is :"+(c+d));
		//sc.close();
	}
	
	 void Multiply(){
		
	int a,b;
	System.out.println("multiplication ");
	System.out.println("enter a:");
	a= sc.nextInt();
	System.out.println("enter b:");
	b= sc.nextInt();
	
	
		System.out.println("multiplication of the both is----->"+(a*b));
		
	}
	
	void Multiply(int a, int b){
		System.out.println("multiplication of the both is"+(a*b));
	}
	void Print(){
		System.out.println("Child class print");
	}

}
