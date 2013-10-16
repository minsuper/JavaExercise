package com.Minsup;

public class Chess {
	public static void main(String args[]) {
		// (NxN) chessboard. from (x,y) to (p,q), find a minimum number of moves
		
		// Knight can move relatively (1, 2), (-1, 2), (1, -2), (-1, -2), (2, 1), (-2, 1), (2, -1), (-2, -1)
		// move named as                m0       m1      m2        m3       m4       m5      m6        m7 
		
		// Last moves
		// set (p, q) as an origin
		// (1, 1) + m2 --> (2, -1) + m5 --> (0, 0)
		// (0, 1) + m7 --> (-2, 0) + m0 --> (-1, 2) + m2 --> (0, 0)
		// (2, 1) --> straight forward)
		// (2, 0) + m1 --> (1, 2) + m3 --> (0, 0)
		int x = 7, y = 7;
		int p = 2, q = 7;
		int count = 0;
		
		System.out.print("("+x+","+y+") --> ");
		while(Math.abs(p-x) + Math.abs(q-y) > 3) {
		    int dx = p-x;
		    int dy = q-y;
		    if(Math.abs(dx) < Math.abs(dy)) {
		    	if(dy > 0) y += 2;
		    	else y -= 2;
		    	if(dx > 0) x += 1;
		    	else x -= 1;
		    }
		    else {
		    	if(dy > 0) y += 1;
		    	else y -= 1;
		    	if(dx > 0) x += 2;
		    	else x -= 2;		    
		    }
		    count++;
			System.out.print("("+x+","+y+") --> ");		
		}
		
		// Count the last move
		int sum = Math.abs(p-x) + Math.abs(q-y);
		switch(sum) {
			case 3 :
				break;
			case 2 : 
				count += 2;
				break;
			case 1 : 
				count += 3;
				break;
			default :
				System.out.println("Something wrong");
		}
		
		System.out.println("The minimum number of move : " + count); 
		
		
	}
/*	
	public static int generalMoveCount(int x, int y, int p, int q) {
		int dx = Math.abs(x-p);
		int dy = Math.abs(y-q);
		
		int rx = dx%3;
		int ry = dy%3;
		
		
	}*/

}
