package com.csi.coreconcept;

interface A {

	void set();

	default void add() {
		System.out.println("hi");      //java 8 interface static and default method
	}

	static void sub() {    
		System.out.println("no");  
	}

}

public class B implements A {

	public void set() {

	}
	public static void main(String[] args) {
		B b=new B();
		b.add();
		A.sub();    // interface name.static method
	}
	
}
