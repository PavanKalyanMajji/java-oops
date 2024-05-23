package com.tcs.javaoops.polymorphism;
/**
 * 
 * CompileTimePolymorphism 
 * methods will bind while compile time example:- Method Overloading.
 *
 */

/**
 * 
 * Method Overloading is nothing but method name are same but difference in arguments
 * difference in length parameter.
 * difference in sequence of parameter.
 * difference in Data types.
 *
 */
public class CompileTimePolymorphism {
	public void main() {
		System.out.println("Main Method with no arguments");
	}
	public void main(int x) {
		System.out.println("main method with integer argument");
	}
	public void main(int x,String y) {
		System.out.println("main method with int and String");
	}
	
	public void main(String y,int x) {
		System.out.println("main method with String and int");
	}
	public void main(String name,int age,int id) {
		System.out.println("main method with String,int and int");
	}
	
	public static void main(String[] args) {
		CompileTimePolymorphism object=new CompileTimePolymorphism();
		object.main();
		object.main(10);
		object.main(10,"Pavan");
		object.main("pavan", 10);
		object.main("Pavan Kalyan majji", 25, 420);
	}
}
