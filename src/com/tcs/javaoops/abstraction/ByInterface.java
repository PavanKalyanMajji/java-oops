package com.tcs.javaoops.abstraction;

/**
 * Steps need to follow the abstraction: 
 * create an interface with an abstract method.
 * create a class and implements interface.
 * override the method on sub class.
 * do up-casting. (Up-casting is storing sub class object into a super class reference)
 * call abstract method by using up-casting reference.
 *
 */
interface School {
	public void teacherDetails();
}

class Teacher implements School {

	@Override
	public void teacherDetails() {
		System.out.println("Name: Keshava, Skill: JAVA");
	}
	
}
public class ByInterface {
	public static void main(String[] args) {
		School schoolObject=new Teacher();//up-casting object
		schoolObject.teacherDetails();//Name: Keshava, Skill: JAVA
	}
}
