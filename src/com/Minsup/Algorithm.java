package com.Minsup;

import java.util.ArrayList;

public class Algorithm {
	public static <T> int countOdd(ArrayList<T> c, testInterface<T> t) {
		int count = 0;
		for(T i : c) {
			if(t.test(i))
				count++;
		}	
		return count;
	}
}
