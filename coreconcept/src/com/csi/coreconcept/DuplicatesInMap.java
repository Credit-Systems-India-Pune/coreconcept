package com.csi.coreconcept;

import java.util.HashSet;
import java.util.TreeMap;

public class DuplicatesInMap {

	public static void main(String[] args) {
		TreeMap<Integer,Integer> hm = new TreeMap<>();

		hm.put(1, 1);
		hm.put(2, 1);
		hm.put(3, 2);
		hm.put(4, null);
		hm.put(5, null);             //in hashmap only one null key is allowed 
		
//		

		System.out.println(hm);

	//System.out.println("\n\t"+hm);
//	HashSet hs=new HashSet(hm.values());
//		//hs.forEach(System.out::println);
//		hs.forEach((g)->System.out.println(g));
//	
	}

}
