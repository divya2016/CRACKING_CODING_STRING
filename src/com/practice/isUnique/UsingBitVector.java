package com.practice.isUnique;

import java.util.Arrays;
import java.util.Scanner;

public class UsingBitVector {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Boolean bool = isUnique(s);
		if (bool) {
			System.out.println("All Unique Character");
		} else {
			System.out.println("Duplicate Character");
		}
		scan.close();
	}

	private static Boolean isUnique(String s) {
		int counter=0;
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
				int num =arr[i]-'a';
				if((counter & (1<<num)) >0) {
					return false;
				}
				counter |=1 <<num;
			}
		return true;
	}
}