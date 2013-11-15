package com.Minsup;

enum Test {
	abyss, backyard, car, dart, elf, flower, goose, house;
	
	private int len;
	public void setLen(int l) {
		len = l;
	}
	public int getLen() {
		return len;
	}
}
public class JE13 {
	int[] mInt = new int[10];
	int a = 10;
	public static void main(String[] args) {
		char[] input = {'a', 'b', 'c'};
		char[] aux = new char[input.length];
		
		printAllSet(input, aux, 0, 0, input.length);
		
		for(Test t : Test.values()) {
			t.setLen(t.toString().length());
		}
		for(Test t : Test.values()) {
			System.out.println("Values : " + t + t.getLen());
		}
		System.out.println();
	}
	
	static void printAllSet(char[] input, char[] aux, int start, int depth, int length) {
		int i;
		if(start < length) {
			aux[depth] = '\0';
			System.out.println(aux);
		}
		for(i=start; i<length; i++) {
			aux[depth] = input[i];
			printAllSet(input, aux, i+1, depth+1, length);
		}
	}
}
