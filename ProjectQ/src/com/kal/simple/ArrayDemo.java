package com.kal.simple;

import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayDemo {

    public static void main(String [] args)
    {

        Function<String,Integer> f=s -> s.length();
        Predicate<String> p=s -> s.length()>3;
        System.out.println(f.apply("Surga"));
        System.out.println(f.apply("maheshkarla"));
        System.out.println(p.test("Mayur"));
        System.out.println(p.test("Kalpesh"));

    }
}
