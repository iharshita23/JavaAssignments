package com.shristi.basicscanner;

import java.util.Scanner;

public class LongestWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String word = sc.nextLine();
		
		String[] arr = word.split(" ");
		String longest = "";
		
		for(String words : arr) {
			if(words.length() > longest.length()) {
				longest = words;
			}
		}
		System.out.println("Longest Word: " + longest);
	}

}
