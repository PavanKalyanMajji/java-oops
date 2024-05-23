package com.tcs.javaoops.abstraction;
/**
 * 
 * @author MAJJI PAVAN KALYAN
 * 
 * Abstraction can achieve two ways By using Abstract class or Interface.
 * Abstraction can achieve by using abstract method only. so abstract methods are allow only on interface and abstract class.
 *
 */
abstract class Bank {
	public abstract void accountDetails();
}

class Person extends Bank{

	@Override
	public void accountDetails() {
		System.out.println("Name : Majji Pavan Kalyan, AccountNo: 112233");
	}
	
}
/**
 * Steps need to follow the abstraction: 
 * create an abstract class with an abstract method.
 * create a class and extend abstract class.
 * override the method on sub class.
 * do up-casting. (Up-casting is storing sub class object into a super class reference)
 * call abstract method by using up-casting reference.
 *
 */
public class ByAbstractClass {
	public static void main(String[] args) {
		Bank bank=(Bank)new Person(); //up-casting object.
		bank.accountDetails();//Name : Majji Pavan Kalyan, AccountNo: 112233
	}
}
