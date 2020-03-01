package com.practice.isUnique;

import java.util.*;


public class UsingSet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		Boolean bool=isUnique(s);
		if(bool) {
			System.out.println("All Unique Character");
		}else {
			System.out.println("Duplicate Character");
		}
		scan.close();
	}

	private static Boolean isUnique(String s) {
		Set<Character> uniSet = new HashSet<>();
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length;i++) {
			if(!uniSet.add(arr[i])) {
				return false;
			}
		}
		return true;
	}

}
