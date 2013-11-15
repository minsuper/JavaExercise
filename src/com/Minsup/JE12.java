package com.Minsup;

public class JE12 {
	public static void main(String[] args) {
		// Generated 2nd array which contains running average of the original array.
		int orig[] = {2, 6, 4, 2, 3};
		int N = 3;
		
		int newLength = N-1 + orig.length + N-1;
		int orig2[] = new int[newLength];
		for(int i=0; i<newLength; i++) {
			if(i<N-1) 
				orig2[i] = orig[0];
			else if(i>=newLength-N+1)
				orig2[i] = orig[orig.length-1];
			else 
				orig2[i] = orig[i-N+1];
		}
		
		int res[] = new int[orig2.length-N+1];
		for(int i=0; i<orig2.length-N+1; i++) {
			res[i] = Average(orig2, i, i+N);
			System.out.print(res[i] + " ");
		}
		System.out.println("");
	}
	
	static int Average(int[] arr, int i, int j) {
		int sum=0;
		
		for(int k=i; k<j; k++) {
			sum += arr[k];
		}
		sum /= j-i;
		
		return sum;
	}
}
