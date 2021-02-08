package com.java.string;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String content = "my Name is Kalpesh";
		String n = reverseWord(content, 0);
		System.out.println(n);
	}

	public static String reverseWord(String str, int n) {
		String result = "";
		String st = "";
		String s[] = str.split(" ");

		if (n >= 0) {
			for (int i = s[n].length() - 1; i >= 0; i--) {
				st += s[n].charAt(i);
			}
			s[n] = st;
		}
		for (String s1 : s) {
			result += s1 + " ";
		}
		return result;
	}

}
