package com.ar.interview.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Martin
 * 
 *         Anagrama
 */

public class StringAnagram {
	public static boolean anAnagram(String word, String anagram) {
		if (word.length() != anagram.length())
			return false;
		Map<Character, Integer> mapW = new HashMap<>();
		Map<Character, Integer> mapA = new HashMap<>();
		for (int i = 0; i < word.length(); i++) {
			incrementMap(mapW, word.charAt(i));
			incrementMap(mapA, anagram.charAt(i));
		}
		return mapW.entrySet().equals(mapA.entrySet());
	}

	private static void incrementMap(Map<Character, Integer> map, Character c) {
		if (map.containsKey(c))
			map.put(c, map.get(c) + 1);
		else
			map.put(c, 1);
	}
}