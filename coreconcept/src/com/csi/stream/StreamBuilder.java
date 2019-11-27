package com.csi.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBuilder {
	 public static void main(String[] args)
     {
         List<Integer> al =Arrays.asList(1,2,3,4,5,6,7,8,9);
         al.stream().filter(p->p%2==0).forEach(System.out::println);
         
         
        
         System.out.println("printing  string stream");
         
         Stream <String> stream1=Stream.of("pr","ram","tak");
         stream1.forEach(System.out::println);
         
         System.out.println("no which are divisible by 3");
         Stream<Integer> stream2 = Stream.of( new Integer[]{11,21,32,24,25,63,47,8,9} );
         stream2.filter(p->p%3==0).forEach(p->System.out.println(p));
         
         
     }

}
