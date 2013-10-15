package com.Minsup;
import java.util.*;

public class JE4 {
	public static void main(String[] args) {
		// permutation
		ArrayList<String> str = new ArrayList<>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("d");
		str.add("e");

		Permutation(str, 0);
	}
	
	static void Permutation(ArrayList<String> str, int index) {
		int i;
		if(index == str.size()) {
			for(String s : str) {
				System.out.print(s + " ");
			}
			System.out.println("");
			return;
		}		
		for(i=index; i<str.size(); i++) {
			swap(str, i, index);
			Permutation(str, index+1);
			swap(str, i, index);
		}

	}
	
	static void swap(ArrayList<String> str, int i, int j) {
		String temp;
		
		temp = str.get(i);
		str.set(i, str.get(j));
		str.set(j, temp);
	}
}
