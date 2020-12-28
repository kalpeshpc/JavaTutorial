package com.kal.simple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayDemo {

    public static void main(String [] args)
    {

     Integer [] a={1,2,3,4,5,6,7,8};
     for (int i=0;i<a.length;i++)
     {
         System.out.println(a[i]);
     }

     //converting array into List
        List<Integer> l= Arrays.asList(a);
     System.out.println(l);



    }
}
