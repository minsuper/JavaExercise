package com.Minsup;
import java.util.*;

public class HashExercise {
	public static void main(String[] args) {
		// Test of HashMap and HashTable
		Hashtable<Integer, Integer> hTable = new Hashtable<>();
		HashMap<Integer, Integer> hMap = new HashMap<>();
		Integer[] arr = {1, 5, 4, 5, 1, 1, 2, 3};
		
		for(int i=0; i<arr.length; i++) {
			hTable.put(arr[i], i);
			hMap.put(arr[i], i);
		}
		
		Enumeration<Integer> itr_table = hTable.keys();
		while(itr_table.hasMoreElements()) {
			Integer k = itr_table.nextElement();
			System.out.println("key : " + k + " value : " + hTable.get(k));
		}
		Iterator<Integer> itr_map = hMap.keySet().iterator();
		while(itr_map.hasNext()) {
			Integer k = itr_map.next();
			System.out.println("key : " + k + " value : " + hMap.get(k));
		}
	}
}
