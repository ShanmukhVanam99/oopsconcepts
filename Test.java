package com.to.Inheritance;
import java.util.Scanner;



abstract class Div 
{


abstract  void div();

}
class Test extends Div{
	private static Scanner sc;

 void div(){
		int a,b;
		sc = new Scanner(System.in);
	System.out.println("div ");
	System.out.println("enter a:");
	a= sc.nextInt();
	System.out.println("enter b:");
	b= sc.nextInt();
	
	
		System.out.println("div of the both is----->"+(a/b));
		
	}
 void Print(){
	 System.out.println("Parent class Print");
 }
}
