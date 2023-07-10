package com.shristi.basicscanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        char maxLetter = findMaxLetterOccurrence(word);
        int maxOccurrence = getMaxOccurrence(word, maxLetter);

        System.out.println("Maximum occurrence of a letter: " + maxOccurrence);
    }

    private static char findMaxLetterOccurrence(String word) {
        Map<Character, Integer> letterCountMap = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            letterCountMap.put(letter, letterCountMap.getOrDefault(letter, 0) + 1);
        }

        int maxOccurrence = 0;
        char maxLetter = '\0';

        for (Map.Entry<Character, Integer> entry : letterCountMap.entrySet()) {
            if (entry.getValue() > maxOccurrence) {
                maxOccurrence = entry.getValue();
                maxLetter = entry.getKey();
            }
        }
        return maxLetter;
    }

    private static int getMaxOccurrence(String word, char maxLetter) {
        int maxOccurrence = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == maxLetter) {
                maxOccurrence++;
            }
        }

        return maxOccurrence;
	}

}
