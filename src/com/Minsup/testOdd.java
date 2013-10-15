package com.Minsup;

public class testOdd implements testInterface<Integer> {
	public boolean test(Integer i) {
		if(i.intValue()%2 == 1)
			return true;
		else return false;
	}
}
