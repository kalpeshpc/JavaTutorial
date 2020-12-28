package com.kal.simple;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        int val = beautifulDays(20, 23, 6);
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Number is not prime");
        }
    }

    public static boolean isPrime(int no) {
        if (no < 1)
            return false;
        for (int i = 2; i < Math.sqrt(no); i++) {
            if (no % i == 0) {
                return false;
            }
        }
        return true;
    }

//    public static String solution(int k, int a[])
//    {
//
//    }
//Hacker Earth Program.
    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        int ii;
        for (ii = i; ii <= j; ii++) {
            int rev = 0;
            int temp = ii;
            while (temp != 0) {
                int r = temp % 10;
                rev = rev * 10 + r;
                temp /= 10;
            }
            if ((ii - rev) % k == 0) {
                count++;
            }
        }
        return count;
    }

}
