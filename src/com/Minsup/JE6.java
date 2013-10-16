package com.Minsup;

public class JE6 {
	public static void main(String args[]) {
		// find a max (c, d) - (a, b) where c>a and d>b in n x n matrix
		int mat[][] = { 
				{0, 1, 3, 4},
				{3, 5, 2, 1},
				{0, 6, 7, 0},
				{4, 1, 3, 2}
		};
		int res[][] = new int[4][4];
		
		int result = -1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				res[i][j] = mat[i][j];
				if(i > 0) {
					res[i][j] = Math.min(res[i][j], res[i-1][j]);
				}
				if(j > 0) {
					res[i][j] = Math.min(res[i][j], res[i][j-1]);
				}
				if(i>0 && j>0) {
					result = Math.max(result, mat[i][j] - res[i-1][j-1]);
				}
			}
		}
		
		System.out.println("result = " + result);
	}
}
