package com.practice.isUnique;

import java.util.Scanner;

public class TakingAnArray {
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
		if (s.length() > 128) {
			return false;
		}
		boolean[] arr = new boolean[128];
		for (int i = 0; i < s.length(); i++) {
			int val = s.charAt(i);
			if (arr[val]) {
				return false;
			}
			arr[val] = true;
		}
		return true;
	}

}