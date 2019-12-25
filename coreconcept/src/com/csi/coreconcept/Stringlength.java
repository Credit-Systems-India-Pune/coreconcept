package com.csi.coreconcept;

import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a string gxd");
		String s=sc.nextLine();
		String[] a= s.split(" ");
	
		for (String i:a)
		{
			System.out.println(i+i.length());
		}
	}

}
