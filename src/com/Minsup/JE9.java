package com.Minsup;
import java.util.*;

public class JE9 {
	public static void main(String[] args) {
		// Find all permutations 
		HashMap<Character, Integer> hMap = new HashMap<>();
		hMap.put('a', 0);
		hMap.put('b', 4);
		hMap.put('c', 2);
		hMap.put('d', 2);
		hMap.put('e', 2);
		hMap.put('f', 3);
		hMap.put('g', 4);
		hMap.put('h', 5);
		hMap.put('i', 7);
		hMap.put('j', 6);
		hMap.put('k', 7);
		hMap.put('l', 8);
		hMap.put('m', 6);
		hMap.put('n', 5);
		hMap.put('o', 8);
		hMap.put('p', 9);
		hMap.put('q', 0);
		hMap.put('r', 3);
		hMap.put('s', 1);
		hMap.put('t', 4);
		hMap.put('u', 6);
		hMap.put('v', 3);
		hMap.put('w', 1);
		hMap.put('x', 1);
		hMap.put('y', 5);
		hMap.put('z', 0);
		
		int[] test = {2, 8, 3, 6};
		Character[] result = new Character[test.length];
		
		Permutation(test, hMap, result, 0);
	}
	
	static void Permutation(int[] test, HashMap<Character, Integer> hMap, Character[] result, int index) {
		if(index==test.length-1) { // reach the last digit
			for(Map.Entry<Character, Integer> entry : hMap.entrySet()) {
				if(entry.getValue() == test[index]) {
					result[index] = entry.getKey();
					for(int i=0; i<result.length; i++)
						System.out.print(result[i] + " ");
					System.out.println("");
				}
			}
		}
		else {
			for(Map.Entry<Character, Integer> entry : hMap.entrySet()) {
				if(entry.getValue() == test[index]) {
					result[index] = entry.getKey();
					Permutation(test, hMap, result, index+1);
				}
			}
		}
	}
}
