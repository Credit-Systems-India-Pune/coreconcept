package com.csi.mapinternal;

public class A {
	public static void main(String[] args) {
		String s="FB";  //sometimes objects are not  same but they have same hashcode
		String s1="Ea";
		
		System.out.println(s.hashCode()+" "+s1.hashCode());//2236  2236
		System.out.println(s.equals(s1));//false
		System.out.println(s==s1);//false
		System.out.println(s.hashCode()==s1.hashCode());//true
		
		String a="aa";
		String b="aa";//same object have same hashcode
		System.out.println(a.hashCode()+" "+b.hashCode());//3104 3104
		
		
		
	}

}
