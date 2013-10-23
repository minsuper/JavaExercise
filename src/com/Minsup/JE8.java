package com.Minsup;

public class JE8 {
	public static void main(String[] args) {
		int input[][] = { {	0,0,0,1,1,1,1,1,1,0,0,0,1,1 }, 
						  { 1,1,1,0,0,0,1,0,1,1,1,1,1,0 },
						  { 1,1,0,0,0,1,1,1,1,1,1,1,0,0 },
						  { 0,0,1,1,1,1,0,0,0,0,1,1,1,1 },
						  { 0,0,1,1,0,0,0,0,1,1,0,0,0,0 },
						  { 1,1,0,0,0,1,0,0,0,0,0,1,1,0 } };
		
		// find the maximum rectangular area covered by 0
		int MaxX = input[0].length;
		int MaxY = input.length;
		int maxM = -1, maxN = -1, maxArea = -1;
		for(int i=0; i<MaxY; i++) {
			for(int j=0; j<MaxX; j++) {
				int lx, rx, uy, dy;
				if(input[i][j] == 0) {
					// grow horizontally first
					lx=j-1;
					rx=j+1;
					while(lx>=0 && input[i][lx]==0) lx--;
					lx++;
					while(rx<MaxX && input[i][rx]==0) rx++;
					rx--;
					// check vertically 
					uy=i-1;
					dy=i+1;
					// Go upward, see if horizontally covered with 0
					while(uy>=0 && input[uy][j]==0) {
						int minx2=j-1, maxx2=j+1;
						while(minx2>=0 && minx2>=lx && input[uy][minx2]==0) minx2--;
						minx2++;
						while(maxx2<MaxX && maxx2<=rx && input[uy][maxx2]==0) maxx2++;
						maxx2--;
						if(minx2>lx) lx = minx2;
						if(maxx2<rx) rx = maxx2;
						uy--;
					}
					uy++;
					// Go downward, see if horizontally covered with 0
					while(dy<MaxY && input[dy][j]==0) {
						int minx2=j-1, maxx2=j+1;
						while(minx2>=0 && minx2>=lx && input[dy][minx2]==0) minx2--;
						minx2++;
						while(maxx2<MaxX && maxx2<=rx && input[dy][maxx2]==0) maxx2++;
						maxx2--;
						if(minx2>lx) lx = minx2;
						if(maxx2<rx) rx = maxx2;
						dy++;
					}
					dy--;
					int areax = rx-lx+1;
					int areay = dy-uy+1;
					int area = areax*areay;
					
					System.out.println("("+j+","+i+")  area : (" + areax + "," + areay + ")");
					if(area>maxArea) {
						maxArea = area;
						maxM = areax;
						maxN = areay;
					}				
				}
			}
		}
		
		System.out.println("Max area : (" + maxM + "," + maxN + ")");
	}
}
