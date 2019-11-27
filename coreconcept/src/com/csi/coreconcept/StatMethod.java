package com.csi.coreconcept;

public class StatMethod {

	static void run() {          //use of static method
		System.out.println("hi");
	}

	public static void main(String[] args) {
		StatMethod st=new StatMethod();
		st.run();
		run();
		StatMethod.run();
		
	}
}
