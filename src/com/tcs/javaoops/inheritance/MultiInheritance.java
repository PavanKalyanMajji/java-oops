package com.tcs.javaoops.inheritance;
class Source {
	public void ramMemory() {
		System.out.println("8gb-ram 64-internal");
	}
}
class Laptop extends Source{
	public void laptop() {
		System.out.println("Laptop");
	}
}
class Desktop extends Source{
	public void desktop() {
		System.out.println("Desktop");
	}
}
public class MultiInheritance {

}
