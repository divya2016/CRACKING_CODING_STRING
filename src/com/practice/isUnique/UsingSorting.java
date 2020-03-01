package com.practice.isUnique;

import java.util.Scanner;

public class UsingSorting {
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
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length-1; i++) {
				if(arr[i]==arr[i+1]) {
					return false;
				}
			}
		return true;
	}

}
