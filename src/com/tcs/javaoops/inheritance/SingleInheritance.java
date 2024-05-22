package com.tcs.javaoops.inheritance;

class Parent {
	
	int x=10;
	
	public void parentMethod() {
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	
	int y=20;
	
	public void ChildMethod() {
		System.out.println("Child Method");
	}
	
	@Override
	public void parentMethod() {
		System.out.println("Implementation coming from Child class");
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		Child childObject=new Child();
		childObject.ChildMethod(); //Child Method
		childObject.parentMethod();//Parent method
		System.out.println(childObject.x);//10
		System.out.println(childObject.y);//20
		
		Parent parentObject=new Parent();
		parentObject.parentMethod();//Parent Method
		System.out.println(parentObject.x);//10
		
//		Up-casting: - Storing Sub class object into Super class Reference 
		
		Parent upCastObject=(Parent)new Child();
		upCastObject.parentMethod();//Implementation coming from Child class
		System.out.println(upCastObject.x);//10
		
//		Down-Casting: - Storing up-casting reference into Subclass reference
		
		Child downCastObject=(Child)upCastObject;
		downCastObject.ChildMethod();//Child Method
		downCastObject.parentMethod();//Implementation coming from Child class
		System.out.println(downCastObject.x);//10
		System.out.println(downCastObject.y);//20
		
	}
}
