package com.kal.simple;

import java.util.Scanner;

public class StrinfFunctions {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();

        byte [] toByte=str.getBytes();
        System.out.println(toByte);
        int h=str.length()-1;
        for(int i = 0;i<h; i++,h--)
        {
            byte temp=toByte[i];
            toByte[i]=toByte[h];
            toByte[h]=temp;
        }
    }
}
