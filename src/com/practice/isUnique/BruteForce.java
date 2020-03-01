package com.practice.isUnique;

import java.util.Scanner;

public class BruteForce {
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
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
