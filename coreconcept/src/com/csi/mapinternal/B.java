package com.csi.mapinternal;

import java.util.HashMap;
import java.util.Map;

public class B {
	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put(null, 47);
		map.put(null, 77);
		map.put("aaa", 3);

		map.put("FB", 007);// 2236
		
		map.put("Ea", 90);// 2236
		map.put("aaa", 5555);

		System.out.println(map);
	}

}
