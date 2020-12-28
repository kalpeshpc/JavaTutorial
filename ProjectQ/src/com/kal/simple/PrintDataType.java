package com.kal.simple;

import java.util.Scanner;

public class PrintDataType {

    public static void main(String[] args)
    {
        String s="Name pace";
        Scanner sc=new Scanner(System.in);
        String ss=sc.nextLine();
        System.out.println(ss);
        System.out.println(s.concat(ss));
    }
}
