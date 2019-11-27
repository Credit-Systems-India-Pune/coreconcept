package com.csi.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting {
	public static void main(String[] args) {
        //sort primitives array like int array
       
		int[] intArr ={1,5,4,1,2,2,3};
       //Arrays.sort(intArr);
       Arrays.asList(intArr);
        System.out.println(Arrays.toString(intArr));
       
      //sorting String array
        String[] strArr = {"Abxn", "sbnC", "AkkB", "CaZ", "Eaa"};
      Arrays.sort(strArr);
      System.out.println(Arrays.toString(strArr));
      
      
      //sorting list of objects of Wrapper classes
      List<String> strList = new ArrayList<String>();
      strList.add("A");
      strList.add("C");
      strList.add("B");
      strList.add("Z");
      strList.add("E");
    //  Collections.sort(strList);
      Collections.reverse(strList);
      for(String str: strList)
    	  {
    	  System.out.print(" "+str);
    	  }
      
      
}
}
