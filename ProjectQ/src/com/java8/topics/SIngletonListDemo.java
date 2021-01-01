package com.java8.topics;

import java.util.Collections;
import java.util.List;

public class SIngletonListDemo {
    public static void main(String[] args) {
        List<Integer> numList = Collections.singletonList(10);
        System.out.println("Elements Count: " + numList);
      //  numList.add(12); //Here We will Get Exceptipon  :- Exception in thread "main" java.lang.UnsupportedOperationException
        System.out.println("Elements Count: " + numList);
        //numList.add(20);       // throws UnsupportedOperationException
        List<String> strList = Collections.singletonList("Kalpesh");
        System.out.println("List Of Elements: " + strList);


        //Joining String
        String [] arr={"Kalpesh","Chaudhari","MCA","PUNE"};
        String fullDetails=String.join("*",arr);
        System.out.println(fullDetails);

        //Excat Demo

        System.out.println(19000*10000123); //1023775976

        System.out.println(Math.multiplyExact(19000,10000123)); //Exception in thread "main" java.lang.ArithmeticException
    }
}
