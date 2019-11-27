package com.csi.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int pId;
	String pName;
	double pPrice;

	Product(int pId, Double pPrice, String pName)

	{
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + "]";

	}

}

public class Test5ArrayListFiltration {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		list.add(new Product(12123, 4536.33, "mi"));
		list.add(new Product(1212, 56.33, "jio"));
		list.add(new Product(123, 75362.33, "sony"));
		list.add(new Product(125555, 536.33, "aj"));
		list.add(new Product(125555, 536.33, "aj"));
		list.add(new Product(125555, 536.33, "aj"));
		list.add(new Product(125555, 536.33, "aj"));
		list.add(new Product(125555, 536.33, "aj"));
		list.add(new Product(125555, 536.33, "aj"));

		list.stream().filter(p -> p.getpId() == 123).forEach(System.out::println);
		// list.stream().sorted().forEach(System.out::println);
		list.stream().filter(p -> p.pName.equals("mi")).forEach(System.out::println);
		long l=list.stream().filter(p -> p.pName.startsWith("a")).count();
		System.out.println(l);
		
		list.stream().filter(p -> p.pName.startsWith("j")).forEach(System.out::println);
		
		
	}

}
