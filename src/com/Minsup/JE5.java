package com.Minsup;
import java.util.*;

public class JE5 {
	public static void main(String args[]) {
		// test of generics
		ArrayList<Integer> IntList = new ArrayList<>();
		
		IntList.add(4);
		IntList.add(7);
		IntList.add(3);
		IntList.add(8);
		IntList.add(9);
		
		int res = Algorithm.<Integer>countOdd(IntList, new testOdd());
		System.out.println("The number of odds : " + res);
		
	}
	
}
