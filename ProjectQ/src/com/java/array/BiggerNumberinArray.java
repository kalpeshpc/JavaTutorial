package com.java.array;

public class BiggerNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 6, 7, 5, 21, 553, 43, 32 };
		System.out.println(biggerNumberIntoArray(arr));
		System.out.println(addallValues(arr));
		System.out.println(averageOfArrayValues(arr));

	}

	public static int biggerNumberIntoArray(int[] a) {
		int bigNo = a[0];
		for (int k : a) {
			if (bigNo < k) {
				bigNo = k; // replacing the bigger NUmber with k .
			}
		}
		return bigNo;
	}

	public static int addallValues(int[] arr) {
		int total = 0;
		for (int k : arr) {
			total = total + k;
		}

		return total;
	}

	public static int averageOfArrayValues(int[] arr) {
		int average = 0;
		for (int k : arr) {
			average = average + k;
		}

		return average / arr.length;
	}

}
