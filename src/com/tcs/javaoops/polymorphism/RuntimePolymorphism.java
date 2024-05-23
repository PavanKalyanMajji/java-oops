package com.tcs.javaoops.polymorphism;

/**
 * 
 * RunTimePolymorphism 
 * Method binds at runtime example: method overriding.
 *
 */
class School {
	public void teacherDetails() {
		System.out.println("Teache Details from Scholl class");

	}
}
class Teacher extends School{

	@Override
	public void teacherDetails() {
		System.out.println("Teacher Details from Teacher class");
	}
	
}

public class RuntimePolymorphism {
	public static void main(String[] args) {
		School schoolObject=new Teacher();
		schoolObject.teacherDetails();//Teacher Details from Teacher class
	}
}
