package com.csi.coreconcept;

public class Stringreverse {

	public static void main(String[] args) {

		String s="pradip";
		String rev=" ";
		                                         //System.out.println(s.length());//6
		for( int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println("Original String : "+s);
		System.out.println("Reversed String : "+rev);
	}

}
