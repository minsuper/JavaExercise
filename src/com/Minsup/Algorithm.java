package com.Minsup;

import java.util.ArrayList;

public class Algorithm {
	static <T> int countOdd(ArrayList<T> c, testOdd<T> t) {
		int count = 0;
		for(T i : c) {
			if(t.testOdd(i))
				count++;
		}	
		return count;
	}
}
