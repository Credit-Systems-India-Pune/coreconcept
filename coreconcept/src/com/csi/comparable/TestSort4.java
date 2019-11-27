package com.csi.comparable;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee>
{
	int eId;
	String eName;
	int eAge;
	
	Employee(int eId,String eName,int eAge){
		this.eId=eId;
		this.eName=eName;
		this.eAge=eAge;
		}
	
   @Override
	
public int compareTo(Employee o)
{
	   if(eAge==o.eAge){
		   return 0;
	   }
	   else if(eAge>o.eAge){
		   return 1;
		   }
	   else
		   return -1;
	   
	}
}

public class TestSort4 {

	public static void main(String[] args) {
	
ArrayList <Employee> list=new ArrayList<>();

		list.add(new Employee(12, "fghjk", 5));
		list.add(new Employee(13,"dfg",567));
		list.add(new Employee(14,"dfgs",987));
		
		Collections.sort(list);
		
		for(Employee e:list)
		{
			System.out.println(e.eAge+" "+e.eId+" "+e.eName);
		}
	}

}
