package com.kal.simple;

import org.omg.Messaging.SyncScopeHelper;

import javax.swing.*;
import java.util.Scanner;

/*
@Author Kalpesh C
This Program Prints number which is System Inputs through scanner
 */
public class SystemInput {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int no=sc.nextInt();
        String name=sc.nextLine();
        System.out.println("name"+name);
        System.out.println(no);
    }

}
