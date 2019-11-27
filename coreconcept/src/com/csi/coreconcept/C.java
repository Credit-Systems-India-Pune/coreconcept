package com.csi.coreconcept;

public class C {

	public static void main(String[] args) {
		String s="praaaaaadip";
		char c='a';
		 int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				++count;
			}
		}	
		System.out.println( " a comes  "+ count  +"   times");

	}

}
